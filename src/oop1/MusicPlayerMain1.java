package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        isOn = true;
        System.out.println("시작 ON");

        volume++;
        System.out.println("volume = " + volume);

        volume++;
        System.out.println("volume = " + volume);

        volume--;
        System.out.println("volume = " + volume);

        System.out.println("isOn = " + isOn);

        isOn = false;
        System.out.println("끄기 OFF");
    }
}
