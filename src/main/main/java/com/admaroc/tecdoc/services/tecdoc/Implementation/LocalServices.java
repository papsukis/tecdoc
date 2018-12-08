package com.admaroc.tecdoc.services.tecdoc.Implementation;


import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class LocalServices extends FtpServices {


   /* public void uploadFile(InputStream file,String path) throws IOException {
        ftp.putFileToPath(file,path);
    }*/

    public void uploadFile(InputStream file,String fileName) throws IOException {
        ftp.putFileToPath(file,"/"+fileName);
    }
}

