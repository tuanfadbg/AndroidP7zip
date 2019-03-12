package com.hzy.p7zip.app;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ContentArchive implements Serializable {
    @SerializedName("file")
    @Expose
    private String file;
    @SerializedName("dir")
    @Expose
    private String dir;
    @SerializedName("size")
    @Expose
    private String size;
    private final static long serialVersionUID = -983810090946703990L;

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
