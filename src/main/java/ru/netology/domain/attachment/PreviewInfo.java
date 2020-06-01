package ru.netology.domain.attachment;

public class PreviewInfo {

    private PhotoInfo photoInfo;
    private GraffitiInfo graffitiInfo;
    private AudioMessage audioMessage;

    public PhotoInfo getPhotoInfo() {
        return photoInfo;
    }

    public void setPhotoInfo(PhotoInfo photoInfo) {
        this.photoInfo = photoInfo;
    }

    public GraffitiInfo getGraffitiInfo() {
        return graffitiInfo;
    }

    public void setGraffitiInfo(GraffitiInfo graffitiInfo) {
        this.graffitiInfo = graffitiInfo;
    }

    public AudioMessage getAudioMessage() {
        return audioMessage;
    }

    public void setAudioMessage(AudioMessage audioMessage) {
        this.audioMessage = audioMessage;
    }
}
