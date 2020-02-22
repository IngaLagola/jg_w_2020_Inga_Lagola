package lv.javaguru.homework.lesson4.level1;

public class LightColorDetector{

    public String detect(int wavelength) {
        String waveColor = "Light is not visible";

        if (wavelength > 380 && wavelength <= 449) {
            waveColor = "Violet";
        } else if (wavelength > 450 && wavelength <= 494) {
            waveColor = "Blue";
        } else if (wavelength > 495 && wavelength <= 569) {
            waveColor = "Green";
        } else if (wavelength > 570 && wavelength <= 589) {
            waveColor = "Yellow";
        } else if (wavelength > 590 && wavelength <= 619) {
            waveColor = "Orange";
        } else if (wavelength > 620 && wavelength <= 750) {
            waveColor = "Red";
        } else {
            waveColor = "Light is not visible";
        }
        return waveColor;
    }
}
