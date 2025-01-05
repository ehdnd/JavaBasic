package oop;

import oop1.MusicPlayerData;

public class MusicPlayer {
    // 음악 플레이어라는 개념을 객체로 온전히 만들어보자
    // 프로그램의 실행 순서보다는 음악 플레이어 클래스를 만드는 것 자체에 집중하자
    // 지금부터 우리는 음악 플레이어를 개발하는 개발자가 될 것이다.
    // 이것을 어떻게 사용할지는 '분리해서' 생각하자.

    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("시작 ON");
    }

    void off() {
        isOn = false;
        System.out.println("종료 OFF");
    }

    void volUp() {
        volume++;
        System.out.println("volume = " + volume);
    }

    void volDown() {
        volume--;
        System.out.println("volume = " + volume);
    }

    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
