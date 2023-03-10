import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class radioTest {

    @Test
    public void shouldCurrentRadio() {
        Radio radio = new Radio();

        radio.setAnyStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrent1Radio() {
        Radio radio = new Radio();

        radio.setAnyStation(11);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNotStation() {
        Radio radio = new Radio();

        radio.setAnyStation(-2);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();
        radio.setAnyStation(9);

        radio.setNextStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNext1Station() {
        Radio radio = new Radio();
        radio.setAnyStation(0);

        radio.setNextStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNePrevStation() {
        Radio radio = new Radio();
        radio.setAnyStation(0);

        radio.setPrevStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNePrev1Station() {
        Radio radio = new Radio();
        radio.setAnyStation(3);

        radio.setPrevStation();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCurrentVolume() {
        Radio radio = new Radio();

        radio.setAnyStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentNotVolume() {
        Radio radio = new Radio();

        radio.setAnyVolume(-3);

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSet0Volume() {
        Radio radio = new Radio();

        radio.setAnyVolume(0);

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSet11Volume() {
        Radio radio = new Radio();

        radio.setAnyVolume(11);

        int expected = 11;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextVolume() {
        Radio radio = new Radio();
        radio.setAnyVolume(4);

        radio.setIncreaseVolume();

        int expected = 5;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setAnyVolume(8);

        radio.setDecreaseVolume();

        int expected = 7;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecrease1Volume() {
        Radio radio = new Radio();
        radio.setAnyVolume(0);

        radio.setDecreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDNext1Volume() {
        Radio radio = new Radio();
        radio.setAnyVolume(10);

        radio.setIncreaseVolume();

        int expected = 11;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldAnyVolume() {
        Radio radio = new Radio();

        radio.setAnyVolume(12);

        int expected = 12;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

}