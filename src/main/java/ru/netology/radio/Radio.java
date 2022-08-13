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

    public void NextCurrentRadioStation() {
        if (currentRadioStation >= lastRadioStation) {
            currentRadioStation = firstRadioStation;
        }
        else {
            currentRadioStation++;
        }
    }

    public void PrevCurrentRadioStation() {
        if (currentRadioStation <= firstRadioStation) {
            currentRadioStation = lastRadioStation;
        }
        else {
            currentRadioStation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }


    public void IncreaseCurrentVolume() {
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }
        else {
            currentVolume++;
        }

    }

    public void DecreaseCurrentVolume() {
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        }
        else {
            currentVolume--;
        }
    }


}

