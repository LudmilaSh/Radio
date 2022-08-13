package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {

        this.currentRadioStation = currentRadioStation;
    }

    public void NextCurrentRadioStation() {
        if (currentRadioStation >= 9) {
            currentRadioStation = 0;
        }
        else {
            currentRadioStation++;
        }
    }

    public void PrevCurrentRadioStation() {
        if (currentRadioStation <= 0) {
            currentRadioStation = 9;
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
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
        else {
            currentVolume++;
        }

    }

    public void DecreaseCurrentVolume() {
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
        else {
            currentVolume--;
        }
    }


}

