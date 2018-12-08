package com.admaroc.tecdoc.tecdoc.model;

import javax.persistence.*;

@Entity
@Table(name="file_structure")
public class FileStructure {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(name="filename")
    String filename;
    @Column(name="table_name")
    String tableName;
    String name;
    int pos;
    int length;
    String type;
    String description;

    public FileStructure() {
    }

    public FileStructure(String filename, String tableName, String name, int pos, int length, String type, String description) {
        this.filename = filename;
        this.tableName = tableName;
        this.name = name;
        this.pos = pos;
        this.length = length;
        this.type = type;
        this.description = description;
    }

    public FileStructure(String filename, String name, int pos, int length, String type, String description) {
        this.filename = filename;
        this.name = name;
        this.pos = pos;
        this.length = length;
        this.type = type;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }


    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
