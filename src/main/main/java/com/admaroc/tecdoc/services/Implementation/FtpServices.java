package com.admaroc.tecdoc.services.Implementation;


import com.admaroc.tecdoc.model.FtpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class FtpServices {


    FtpClient ftp;

    public FtpClient connect(String ipAddress,int port, String userName, String password)
    {
        ftp=new FtpClient(ipAddress,port,userName,password);
        //ftp.config(ipAddress,port,userName,password);
        List<String> files=new ArrayList<>();
        System.out.println("Connecting to " + ipAddress + " as " + userName + "/" + password);
        try
        {
            ftp.open();
            files=ftp.listFiles("/");
            for(String s:files)
            {
                if(s.endsWith(".zip")){
                    ftp.uncompressFile(s,"/");
                }
            }
            return ftp;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }


    public String CurrentDirectory() {
        try {
            return ftp.currentDirectory();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void changeDirectory(String path) throws IOException{
        ftp.changeDirectory(path);
    }

    public List<String> listAllFiles(){
        List<String> files=new ArrayList<>();

        try {

            files= ftp.listFiles("/");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return files;
    }
    public List<String> listAllDirectories(){
        List<String> files=new ArrayList<>();

        try {
            files= (List<String>) ftp.listDirectories("/");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return files;
    }
  /* public void changeDirectoryOfFile(FTPClient client,String filename,String path) throws FTPException, IOException, FTPIllegalReplyException {
        client.rename(filename,path+filename);
   }

   public void downloadFile(FTPClient client,File file,String filename) throws FTPIllegalReplyException, FTPDataTransferException, FTPException, FTPAbortedException, IOException {
        client.download(filename,file);
   }

    public void downloadFile(FTPClient client,String path,String filename) throws FTPIllegalReplyException, FTPDataTransferException, FTPException, FTPAbortedException, IOException {
        client.download(filename,new File(path+filename));
    }

   public void uploadFile(FTPClient client,File file,String filename) throws FTPIllegalReplyException, FTPDataTransferException, FTPException, FTPAbortedException, IOException {
        client.upload(file);
   }

*/

}
