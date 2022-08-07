package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetAmountRadioStation() {
        Radio radio = new Radio(5);
        Assertions.assertEquals(5, radio.getAmountRadioStation());
    }

    @Test
    public void shouldSetAmountRadioStationNoParam() {
        Radio radio = new Radio();
        Assertions.assertEquals(10, radio.getAmountRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);
        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNoSetRadioStationAboveMax() {
        Radio radio = new Radio();

        radio.setNextCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStation() {
        Radio radio = new Radio();

        radio.setNextCurrentRadioStation(5);
        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNoSetRadioStationLessMin() {
        Radio radio = new Radio();

        radio.setPrevCurrentRadioStation(-1);
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStation() {
        Radio radio = new Radio();

        radio.setPrevCurrentRadioStation(8);
        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseMaxVolume() {
        Radio radio = new Radio();

        radio.setChangingCurrentVolume(101);
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseMinVolume() {
        Radio radio = new Radio();

        radio.setChangingCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangingCurrentVolume() {
        Radio radio = new Radio();

        radio.setChangingCurrentVolume(1);
        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
