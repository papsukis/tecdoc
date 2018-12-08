package com.admaroc.tecdoc.services.tecdoc.Implementation;


import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class TecdocServices extends FtpServices {

    public InputStream downloadFile(String file) throws IOException {

       return ftp.downloadFile(file);

    }

}

