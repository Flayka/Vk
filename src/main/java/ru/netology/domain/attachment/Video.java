package ru.netology.domain.attachment;

public class Video {

    private	int	id;
    private	int	ownerId;
    private	String title;
    private	String description;
    private	int	duration;
    private	String photo130;
    private	String photo320;
    private	String photo640;
    private	String photo800;
    private	String photo1280;
    private	String firstframe130;
    private	String firstframe320;
    private	String firstframe640;
    private	String firstframe800;
    private	String firstframe1280;
    private	int	date;
    private	int	addingdate;
    private	int	views;
    private	int	comments;
    private	String player;
    private	String platform;
    private	int	canEdit;
    private	int	canAdd;
    private	int	isPrivate;
    private	String accessKey;
    private	int	processing;
    private	int	live;
    private	int	upcoming;
    private	boolean	isFavorite;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getPhoto130() {
        return photo130;
    }

    public void setPhoto130(String photo130) {
        this.photo130 = photo130;
    }

    public String getPhoto320() {
        return photo320;
    }

    public void setPhoto320(String photo320) {
        this.photo320 = photo320;
    }

    public String getPhoto640() {
        return photo640;
    }

    public void setPhoto640(String photo640) {
        this.photo640 = photo640;
    }

    public String getPhoto800() {
        return photo800;
    }

    public void setPhoto800(String photo800) {
        this.photo800 = photo800;
    }

    public String getPhoto1280() {
        return photo1280;
    }

    public void setPhoto1280(String photo1280) {
        this.photo1280 = photo1280;
    }

    public String getFirstframe130() {
        return firstframe130;
    }

    public void setFirstframe130(String firstframe130) {
        this.firstframe130 = firstframe130;
    }

    public String getFirstframe320() {
        return firstframe320;
    }

    public void setFirstframe320(String firstframe320) {
        this.firstframe320 = firstframe320;
    }

    public String getFirstframe640() {
        return firstframe640;
    }

    public void setFirstframe640(String firstframe640) {
        this.firstframe640 = firstframe640;
    }

    public String getFirstframe800() {
        return firstframe800;
    }

    public void setFirstframe800(String firstframe800) {
        this.firstframe800 = firstframe800;
    }

    public String getFirstframe1280() {
        return firstframe1280;
    }

    public void setFirstframe1280(String firstframe1280) {
        this.firstframe1280 = firstframe1280;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getAddingdate() {
        return addingdate;
    }

    public void setAddingdate(int addingdate) {
        this.addingdate = addingdate;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getCanAdd() {
        return canAdd;
    }

    public void setCanAdd(int canAdd) {
        this.canAdd = canAdd;
    }

    public int getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(int isPrivate) {
        this.isPrivate = isPrivate;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public int getProcessing() {
        return processing;
    }

    public void setProcessing(int processing) {
        this.processing = processing;
    }

    public int getLive() {
        return live;
    }

    public void setLive(int live) {
        this.live = live;
    }

    public int getUpcoming() {
        return upcoming;
    }

    public void setUpcoming(int upcoming) {
        this.upcoming = upcoming;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}
