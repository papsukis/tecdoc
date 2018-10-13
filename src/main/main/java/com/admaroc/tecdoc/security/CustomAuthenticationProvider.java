package com.admaroc.tecdoc.security;

import com.admaroc.tecdoc.Utils.Configuration;
import com.admaroc.tecdoc.model.User;
import com.admaroc.tecdoc.repository.UserRepository;
import com.admaroc.tecdoc.services.Implementation.UserDetailsAdapter;
import main.java.org.jboss.aerogear.security.otp.Totp;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Component;


@Component
public class CustomAuthenticationProvider extends DaoAuthenticationProvider {

    private final Logger logger = LoggerFactory.getLogger(CustomAuthenticationProvider .class);


    @Autowired
    private UserRepository userRepository;


    @Override
        public Authentication authenticate(Authentication auth)
      throws AuthenticationException {
        Configuration config=Configuration.getInstance();
        final User user = userRepository.findByName(auth.getName());
        UserDetailsAdapter userDetailsAdapter=new UserDetailsAdapter(user);
        boolean sameIP=false;
        boolean goodTime=false;

        int minH=config.min.getHourOfDay();
        int minM=config.min.getMinuteOfHour();
        int maxH=config.max.getHourOfDay();
        int maxM=config.max.getMinuteOfHour();
        DateTime current=new DateTime();
        int currentH=current.getHourOfDay();
        int currentM=current.getMinuteOfHour();

        final String verificationCode = ((CustomWebAuthenticationDetails) auth.getDetails()).getVerificationCode();

/*        final Totp totp = new Totp(user.getSecret());
        if ((user == null)) {
            throw new BadCredentialsException("Invalid username or password");
        }

        // to verify verification code

        if ((!isValidLong(verificationCode) || !totp.verify(verificationCode))) {
            throw new BadCredentialsException("Invalid verfication code");
        }


*/
        WebAuthenticationDetails details = (WebAuthenticationDetails) auth.getDetails();

/*
        if(!user.getUsual_IP().matches(details.getRemoteAddress()))
        {
            throw new BadCredentialsException("Bad IP address");
        }
      /* if(!( (( minH <= currentH ) || (minH==currentH && minM <= currentM )) && (( maxH >= currentH ) || (maxH==currentH && maxM >= currentM ))))
        {
            throw new BadCredentialsException("Incorrect time to conect");
        }*/



        return new UsernamePasswordAuthenticationToken(userDetailsAdapter.getUsername(), userDetailsAdapter.getPassword(), userDetailsAdapter.getAuthorities());

    }

        private boolean isValidLong(String code) {
            try {
                Long.parseLong(code);
            } catch (NumberFormatException e) {
                return false;
            }
            return true;
        }


    @Override
    protected void doAfterPropertiesSet() throws Exception {
        if(super.getUserDetailsService() != null){
            System.out.println("UserDetailsService has been configured properly");
        }
    }
    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }


}

