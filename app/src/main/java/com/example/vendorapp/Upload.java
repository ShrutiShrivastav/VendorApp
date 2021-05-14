package com.example.vendorapp;

public class Upload {
    private String mName;
    private String mImageUrl;

    public Upload()
    {
       //empty constructor needned
    }
    public Upload(String name,String mImageUrl)
    {
        if(name.trim().equals(""))
        {
            name ="No Name";
        }
        mName=name;
        mImageUrl=mImageUrl;
    }
    public String getmName(){
        return mName;
    }
    public String setmName(String name){
        return mName;
    }
    public String getmImageUrl(){
        return mImageUrl;
    }
    public String setImageUrl(String imageUrl){
        return mImageUrl;
    }









}
