package ru.netology;

public class Radio {
    // текущая станция
    private int currentStation;
    // текущая громкость
    private int currentVolume;

    // получение номера станции
    public int getCurrentStation() {
        return currentStation;
    }

    // установка номера станции (от 0 до 9)
    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    // переключение на следующую станцию с 9 на 0
    public void nextStation() {
        this.currentStation = currentStation + 1;
        if (currentStation > 9) {
            this.currentStation = 0;
        }
    }

    // переключение станции назад с 0 на 9
    public void prevStation() {
        this.currentStation = currentStation - 1;
        if (currentStation == -1) {
            this.currentStation = 9;
        }
    }

    // переключение на номер станции
    public void stationInput(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    // получение уровня звука
    public int getCurrentVolume() {
        return currentVolume;
    }

    // установка уровня звука
    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    // увеличение громкости
    public void volumeUp() {
        this.currentVolume = currentVolume + 1;
        if (currentVolume >= 10) {
            this.currentVolume = 10;
        }
    }

    // уменьшение громкости
    public void volumeDown() {
        this.currentVolume = currentVolume - 1;
        if (currentVolume <= 0) {
            this.currentVolume = 0;
        }
    }
}
