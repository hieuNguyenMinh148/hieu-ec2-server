package org.hieunm.serverfullec2.constants.permission;

public enum UserPermission {

    // Crawl data management
    CRAWL_DATA_LIST("crawl_data_list"),
    CRAWL_DATA_CREATE("crawl_data_create"),
    CRAWL_DATA_SHOW("crawl_data_show"),
    CRAWL_DATA_UPDATE("crawl_data_update"),
    CRAWL_DATA_DELETE("crawl_data_delete"),
    UPLOAD_FILE_TO_SOCIAL_MEDIA("upload_file_to_social_media"),
    CUT_VIDEO("cut_video"),

    // Author management
    AUTHOR_LIST("author_list"),
    AUTHOR_CREATE("author_create"),
    AUTHOR_SHOW("author_show"),
    AUTHOR_UPDATE("author_update"),
    AUTHOR_DELETE("author_delete"),

    ACCOUNT_LIST("account_list"),
    ACCOUNT_CREATE("account_create"),
    ACCOUNT_DELETE("author_delete"),

    // Member management
    MEMBER_LIST("member_list"),
    MEMBER_SHOW("member_show"),;

    public final String permission;

    UserPermission(String permission) {
        this.permission = permission;
    }

    public String getPrivilege() {
        return this.permission + "_PRIVILEGE";
    }

    public String getPermission() {
        return this.permission;
    }
}
