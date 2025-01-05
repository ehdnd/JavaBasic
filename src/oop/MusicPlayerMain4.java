package oop;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        // 뭐 음악 플레이어가 있대. 사용해보자.
        MusicPlayer player = new MusicPlayer();

        player.on();
        player.volUp();
        player.volUp();
        player.volDown();
        player.showStatus();
        player.off();
    }
}
