package adapter;

public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;
    @Override
    public void play(String fileName) {
        // 通过文件名获取文件类型
        String[] strings = fileName.split("\\.");
        // 点号分隔的最后一个群星.光明.mp3
        String audioType = strings[strings.length - 1];
        switch (audioType.toLowerCase()){
            case "mp3":
                System.out.println("Playing mp3 file. Name: "+ fileName);
                break;
            case "mp4":
            case "vlc":
                mediaAdapter = new MediaAdapter(audioType);
                mediaAdapter.play(fileName);
                break;
            default:
                System.out.println("Invalid media. " + audioType + " format not supported");
                break;
        }
    }
}
