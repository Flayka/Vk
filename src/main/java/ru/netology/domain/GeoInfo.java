package ru.netology.domain;

public class GeoInfo {

    private String type;
    private String coordinates;
    private ObjectsInfo objectsInfo;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public ObjectsInfo getObjectsInfo() {
        return objectsInfo;
    }

    public void setObjectsInfo(ObjectsInfo objectsInfo) {
        this.objectsInfo = objectsInfo;
    }
}
