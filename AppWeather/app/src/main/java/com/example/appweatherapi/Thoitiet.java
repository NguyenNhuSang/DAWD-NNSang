package com.example.appweatherapi;

public class Thoitiet {
    public String Day;
    public String Status;
    public String Image;
    public String MaxTemp;
    public String MinTemp;

    public Thoitiet(String day, String status, String image, String maxTemp, String minTemp) {
        Day = day;
        Status = status;
        Image = image;
        MaxTemp = maxTemp;
        MinTemp = minTemp;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getMaxTemp() {
        return MaxTemp;
    }

    public void setMaxTemp(String maxTemp) {
        MaxTemp = maxTemp;
    }

    public String getMinTemp() {
        return MinTemp;
    }

    public void setMinTemp(String minTemp) {
        MinTemp = minTemp;
    }

    @Override
    public String toString() {
        return "Thoitiet{" +
                "Day='" + Day + '\'' +
                ", Status='" + Status + '\'' +
                ", Image='" + Image + '\'' +
                ", MaxTemp='" + MaxTemp + '\'' +
                ", MinTemp='" + MinTemp + '\'' +
                '}';
    }
}
