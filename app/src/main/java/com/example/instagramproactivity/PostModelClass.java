package com.example.instagramproactivity;

public class PostModelClass {

    int postimg ;
    int postaccimg;
    String postname ;

    String details;

    String postnameTwo;

    public void setPostimg(int postimg) {
        this.postimg = postimg;
    }

    public void setPostaccimg(int postaccimg) {
        this.postaccimg = postaccimg;
    }

    public void setPostname(String postname) {
        this.postname = postname;
    }


    public int getPostimg() {
        return postimg;
    }

    public int getPostaccimg() {
        return postaccimg;
    }

    public String getPostname() {
        return postname;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setPostnameTwo(String postnameTwo) {
        this.postnameTwo = postnameTwo;
    }

    public String getDetails() {
        return details;
    }

    public String getPostnameTwo() {
        return postnameTwo;
    }
}
