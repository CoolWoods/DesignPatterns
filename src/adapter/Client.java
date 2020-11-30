package adapter;

public class Client {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new AudioPlayer();
        mediaPlayer.play("群星.光明.MP3");
        mediaPlayer.play("群星.光明.vlc");
        mediaPlayer.play("群星.光明.mp4");
        mediaPlayer.play("群星.光明.ape");
    }
}
