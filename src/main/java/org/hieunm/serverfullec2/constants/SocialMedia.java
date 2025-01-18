package org.hieunm.serverfullec2.constants;

public enum SocialMedia {

    FACEBOOK("1", "Facebook"),
    INSTAGRAM("2", "Instagram"),
    TWITTER("3", "Twitter"),
    PINTEREST("4", "Pinterest"),
    YOUTUBE("5", "YouTube");

    private String type;
    private String value;

    SocialMedia(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
