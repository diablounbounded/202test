package pojo;

import java.io.File;

public class Comments {
    //public String groomer_name;
    public String text;
    public String filepath;



    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public Comments(String text) {
        this.text = text;
    }
    public Comments(String text,String filepath) {
        this.text = text;
        this.filepath=filepath;
    }

    public String getText() {
        return text;
    }



    public void setText(String text) {
        this.text = text;
    }




}
