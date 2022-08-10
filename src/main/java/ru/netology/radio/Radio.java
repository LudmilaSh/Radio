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
    public void setCurrentVolume() {
        this.currentVolume = currentVolume;
    }


    public void setIncreaseCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume + 1;
        if (newCurrentVolume > 10) {
            this.currentVolume = 10;
        }

    }

    public void setDecreaseCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume - 1;
        if (newCurrentVolume < 0) {
            currentVolume = 0;
        }
    }


}

