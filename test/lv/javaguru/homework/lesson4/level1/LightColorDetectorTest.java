package lv.javaguru.homework.lesson4.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Ok!!
class LightColorDetectorTest{

    @Test
    void shouldBeViolet() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        assertEquals("Violet", lightColorDetector.detect(400));
    }

    @Test
    void shouldBeBlue() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        assertEquals("Blue", lightColorDetector.detect(470));
    }

    @Test
    void shouldBeGreen() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        assertEquals("Green", lightColorDetector.detect(500));
    }

    @Test
    void shouldBeYellow() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        assertEquals("Yellow", lightColorDetector.detect(580));
    }

    @Test
    void shouldBeOrange() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        assertEquals("Orange", lightColorDetector.detect(600));
    }

    @Test
    void shouldBeRed() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        assertEquals("Red", lightColorDetector.detect(630));
    }

    @Test
    void lightIsNotVisible() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        assertEquals("Light is not visible", lightColorDetector.detect(379));
    }
}