package com.example.android_seminar_8_2;

public class Suntagi {

    private int id;
    private String onoma;
    private String perilipsi;
    private int imageId;

    public Suntagi() {

    }

    public  Suntagi(int id , String onoma , String perilipsi , int imageId) {
        this.id = id;
        this.onoma = onoma;
        this.perilipsi = perilipsi;
        this.imageId = imageId;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getId() {
        return id;
    }

    public String getPerilipsi() {
        return perilipsi;
    }

    public void setPerilipsi(String perilipsi) {
        this.perilipsi = perilipsi;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOnoma() {
        return onoma;
    }

    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }
}
