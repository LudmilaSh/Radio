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

        radio.setCurrentRadioStation(10);
        radio.NextCurrentRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStation0() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.NextCurrentRadioStation();
        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStation1() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);
        radio.NextCurrentRadioStation();
        int expected = 2;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStation9() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.NextCurrentRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNoSetRadioStationLessMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);
        radio.PrevCurrentRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStation1() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);
        radio.PrevCurrentRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStation0() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.PrevCurrentRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStation8() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        radio.PrevCurrentRadioStation();
        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);
        radio.IncreaseCurrentVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        radio.DecreaseCurrentVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUpCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.IncreaseCurrentVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUpCurrentVolume100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.IncreaseCurrentVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUpCurrentVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.IncreaseCurrentVolume();
        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.DecreaseCurrentVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownCurrentVolume0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.DecreaseCurrentVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownCurrentVolume100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.DecreaseCurrentVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
}
