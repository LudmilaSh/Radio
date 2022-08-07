package ru.netology.radio;

public class Radio {
    private int amountRadioStation = 10;
    private int firstRadioStation = 0;
    private int lastRadioStation = amountRadioStation - 1;
    private int currentRadioStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;

    public Radio(int amountRadioStation) {
        this.amountRadioStation = amountRadioStation;
    }

    public Radio() {

    }

    public int getAmountRadioStation() {
        return amountRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public void setNextCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation + 1;
        if (currentRadioStation > lastRadioStation) {
            this.currentRadioStation = firstRadioStation;
        }
    }

    public void setPrevCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation - 1;
        if (currentRadioStation < firstRadioStation) {
            this.currentRadioStation = lastRadioStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setChangingCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume + 1;
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
        }
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
    }


}

