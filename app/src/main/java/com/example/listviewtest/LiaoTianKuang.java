package com.example.listviewtest;

public class LiaoTianKuang {

    private int imageId;
    private String name;
    private String message;

    public LiaoTianKuang() {
    }

    public LiaoTianKuang(int imageId, String name, String message) {
        this.imageId = imageId;
        this.name = name;
        this.message = message;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
