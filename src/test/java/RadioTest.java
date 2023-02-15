package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    // переключение на следующую станцию
    @Test
    public void clickNextStation() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentStation(6);
        radio.nextStation();
        int expected = 7;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    // переключение на станцию 0, если нажатие 9+1
    @Test
    public void overMaxStation() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    // переключение на предыдущую станцию
    @Test
    public void clickPrevStation() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentStation(3);
        radio.prevStation();
        int expected = 2;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    // переключение на станцию 9, если нажатие 0-1
    @Test
    public void underMinStation() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    // включить станцию по номеру в пределах 0-9
    @Test
    public void clickStation() {
        ru.netology.Radio radio = new ru.netology.Radio();
        int currentStation = 6;
        int expected = 6;
        radio.stationInput(currentStation);
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    // включить станцию по номеру больше предела 0-9
    @Test
    public void clickStationOverMax() {
        ru.netology.Radio radio = new ru.netology.Radio();
        int currentStation = 11;
        int expected = 0;
        radio.stationInput(currentStation);
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    // получение громкости
    @Test
    public void currentVolume() {
        ru.netology.Radio radio = new ru.netology.Radio();
        int expected = 0;
        radio.getCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    // увеличение громкости
    @Test
    public void clickVolumeUp() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentVolume(4);
        radio.volumeUp();
        int expected = 5;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    // включение громкости если нажатие 10+1
    @Test
    public void overMaxVolume() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentVolume(11);
        radio.volumeUp();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    // уменьшение громкости
    @Test
    public void clickVolumeDown() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentVolume(8);
        radio.volumeDown();
        int expected = 7;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    // уменьшение громкости если нажатие 0-1
    @Test
    public void underMinVolume() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentVolume(-1);
        radio.volumeDown();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }


}