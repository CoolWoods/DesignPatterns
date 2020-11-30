package adapter;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        switch (audioType.toLowerCase()){
            case "mp4":
                advancedMediaPlayer = new Mp4Player();
                break;
            case "vlc":
                advancedMediaPlayer = new VlcPlayer();
            default:
                break;
        }
    }

    @Override
    public void play(String fileName) {
        // 通过文件名获取文件类型
        String[] strings = fileName.split("\\.");
        // 点号分隔的最后一个群星.光明.mp3
        String audioType = strings[strings.length - 1];
        switch (audioType.toLowerCase()){
            case "mp4":
                advancedMediaPlayer.playMp4(fileName);
                break;
            case "vlc":
                advancedMediaPlayer.playVlc(fileName);
            default:
                break;
        }
    }
}
