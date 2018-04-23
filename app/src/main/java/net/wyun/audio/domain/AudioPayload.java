package net.wyun.audio.domain;

public class AudioPayload {

    private String filename;
    private String encodedAudio;
    private String test1;

    public AudioPayload(String filename, String encodedAudio,String test1) {
        this.filename = filename;
        this.encodedAudio = encodedAudio;
        this.test1 = test1;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String type) {
        this.filename = type;
    }

    public String getEncodedAudio() {
        return encodedAudio;
    }

    public void setEncodedAudio(String encodedAudio) {
        this.encodedAudio = encodedAudio;
    }




}
