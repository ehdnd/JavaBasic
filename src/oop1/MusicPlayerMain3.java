package oop1;

/**
 * 메서드 추출
 */

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        // 한계..
        // 데이터와 기능이 분리되어있다.
        // 음악플레이어의 데이터와 음악플레이어의 기능은 다른 곳에 있다..
        // 유지보수 측면에서도 관리 포인트가 2곳으로 늘어난다.

        MusicPlayerData data = new MusicPlayerData();
        on(data);
        volUp(data);
        volUp(data);
        volDown(data);
        showStatus(data);
        off(data);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("시작 ON");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("종료 OFF");
    }

    static void volUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("data.volume = " + data.volume);
    }

    static void volDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("data.volume = " + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
