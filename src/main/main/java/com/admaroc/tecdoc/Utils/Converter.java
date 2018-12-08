package com.admaroc.tecdoc.Utils;

import com.admaroc.tecdoc.tecdoc.model.FileStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Converter {

    List<Map<String,String>> datas;
    List<String> data;
    String filename;

    public Converter() {
    }

    public Converter(List<String> data, String filename) {
        this.data = data;
        this.filename = filename;
    }

    public Converter(List<String> data, String filename, List<FileStructure> fileStructure) {
        this.data = data;
        this.filename = filename;
        this.datas=convert(fileStructure);
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public List<Map<String, String>> getDatas() {
        return datas;
    }
    public void setDatas(List<Map<String, String>> datas) {
        this.datas = datas;
    }
    public List<Map<String,String>> convert(List<FileStructure> atributes)
    {
        List<Map<String,String>> tmp=new ArrayList<>();
        for(String s:data)
        {
            tmp.add(getData(s,atributes));
        }
        return tmp;
    }
    public Map<String,String> getData(String s, List<FileStructure> atributes)
    {

        Map<String,String> atri=new HashMap<>();
        for(FileStructure f:atributes)
        {
            if(f.getName().equals("Reserviert"))
            {
                continue;
            }
            else
            {
                if(!f.getName().equals("Lösch-Flag"))
                {
                String atribute=s.substring(
                        f.getPos(),f.getPos()+f.getLength());
                    if (f.getType().equals("N")) {
                        atribute=parser(atribute);
                    }
                atri.put(f.getName(),atribute);
                }
            }

        }

       return atri;
    }
    public String parser(String s)
    {
        return s.replaceAll(" ","0");
    }
}
