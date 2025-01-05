package oop1;

/**
 * 음악 플레이어와 관련된 데이터 묶기
 */

public class MusicPlayerMain2 {
    public static void main(String[] args) {

        MusicPlayerData data = new MusicPlayerData();

        data.isOn = true;
        System.out.println("시작 ON");

        data.volume++;
        System.out.println("data.volume = " + data.volume);

        data.volume++;
        System.out.println("data.volume = " + data.volume);

        data.volume--;
        System.out.println("data.volume = " + data.volume);

        System.out.println("data.isOn = " + data.isOn);

        data.isOn = false;
        System.out.println("끄기 OFF");
    }
}
