package ru.netology.domain.attachment;

public class AudioMessage {

    private int duration;
    private String linkOgg;
    private String linMp3;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLinkOgg() {
        return linkOgg;
    }

    public void setLinkOgg(String linkOgg) {
        this.linkOgg = linkOgg;
    }

    public String getLinMp3() {
        return linMp3;
    }

    public void setLinMp3(String linMp3) {
        this.linMp3 = linMp3;
    }
}
