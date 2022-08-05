package ru.netology.radio;

public class Radio {
    public int currentRadioStation;
    public int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public void setNextCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation + 1;
        if (currentRadioStation > 9) {
            this.currentRadioStation = 0;
        }
    }

    public void setPrevCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation - 1;
        if (currentRadioStation < 0) {
            this.currentRadioStation = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setChangingCurrentVolume(int currentVolume) {
            this.currentVolume = currentVolume + 1;
        if (currentVolume > 10) {
            this.currentVolume = 10;
        }
        if (currentVolume < 0) {
            currentVolume = 0;
        }
    }



}

