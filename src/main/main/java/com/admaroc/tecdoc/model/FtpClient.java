package com.admaroc.tecdoc.model;

import org.apache.commons.io.FileUtils;
import org.apache.commons.net.PrintCommandListener;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class FtpClient {

    private String server;
    private int port;
    private String user;
    private String password;
    private FTPClient ftp;

    public FtpClient(String server, int port, String user, String password) {
        this.server = server;
        this.port = port;
        this.user = user;
        this.password = password;
    }

    public void config(String s, int p, String u, String pw) {
        this.server = s;
        this.port = p;
        this.user = u;
        this.password = pw;

    }


    public void open() throws IOException {
        ftp = new FTPClient();

        ftp.addProtocolCommandListener(new PrintCommandListener(new PrintWriter(System.out)));

        ftp.connect(server, port);
        int reply = ftp.getReplyCode();
        if (!FTPReply.isPositiveCompletion(reply)) {
            ftp.disconnect();
            throw new IOException("Exception in connecting to FTP Server");
        }

        ftp.login(user, password);

    }

    public void close() throws IOException {
        ftp.disconnect();
    }

    public List<String> listFiles(String path) throws IOException {
        FTPFile[] files = ftp.listFiles(path);
        List<String> file = new ArrayList<>();
        for (FTPFile f : files) {
            if (f.isFile())
                file.add(f.getName());
        }


        return file;//Arrays.stream(files)
        //.map(FTPFile::getName)
        //.collect(Collectors.toList());
    }

    public void putFileToPath(File file, String path) throws IOException {
        ftp.storeFile(path, new FileInputStream(file));
    }


    public void downloadFile(String source, String destination) throws IOException {
        FileOutputStream out = new FileOutputStream(destination);
        ftp.retrieveFile(source, out);

    }

    public Collection<String> listDirectories(String path) throws IOException {
        FTPFile[] directories = ftp.listDirectories();

        return Arrays.stream(directories)
                .map(FTPFile::getName)
                .collect(Collectors.toList());
    }

    public void uncompressFile(String file, String path) throws IOException {

        InputStream f = ftp.retrieveFileStream(file);




        //ZipInputStream zis = new ZipInputStream(f);//new FileInputStream(file));

        ZipFile compressedFile = new ZipFile(convertInputStreamToFile(f));
        Enumeration e=compressedFile.entries();
        ZipEntry entry ;

        while(e.hasMoreElements()) {
            entry = (ZipEntry) e.nextElement();
            System.out.println("entry : " +entry.getName());
            File file1=convertInputStreamToFile(compressedFile.getInputStream(entry));

            putFileToPath( file1,"/");

        }



        /* = .nextElement();
        zis.entries();

        //ftp.makeDirectory(file);
        ZipFile zipFile=new ZipFile(copyInputStreamToFile(f,new File()))
            FileUtils.copyInputStreamToFile(iStream, file2)


            while ((zipEntry = zis.getNextEntry()) != null)
            {
                System.out.println("entry: " + zipEntry.getName() + ", " + zipEntry.getSize());

                ftp.storeFile(path, zipEntry.getInputStream()).
                return zf.getInputStream(entry);
                while (zis.available() > 0)
                    zis.read();
                // I could close the entry, but getNextEntry does it automatically
                // zis.closeEntry()
            }


            try (InputStream unzippedFile = ZipFile.getInputStream(zipEntry)) {
            }
            boolean b = ;
            /*while(zipEntry != null){
            String fileName = zipEntry.;
            File newFile = new File(path + fileName);
            FileOutputStream fos = new FileOutputStream(newFile);
            int len;
            while ((len = zis.read(buffer)) > 0) {
            fos.write(buffer, 0, len);
            }
            fos.close();
            zipEntry = zis.getNextEntry();
            }*/
        //zis.closeEntry();
        //zis.close();
    }

    public File convertInputStreamToFile(InputStream f) throws IOException {

        InputStream initialStream = f;

        File targetFile = File.createTempFile("test",null);

        FileUtils.copyInputStreamToFile(initialStream, targetFile);
        return targetFile;
        }

    public String currentDirectory() throws IOException {
        return ftp.printWorkingDirectory();


    }

    public void changeDirectory(String path){

        try {
            ftp.rename(currentDirectory(),path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

