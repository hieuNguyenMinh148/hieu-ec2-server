package org.hieunm.serverfullec2.constants.permission;

import java.util.HashMap;
import java.util.Map;

public enum UserRole {

    ADMIN("admin", 1, new String[]{

    }),
    USER("user", 2, new String[]{

    });

    private static final Map<String, UserRole> BY_LABEL = new HashMap<>();
    private static final Map<Integer, UserRole> BY_VALUE = new HashMap<>();

    public final String label;
    public final int value;
    public final String[] permissions;

    static {
        for (UserRole e : values()) {
            BY_LABEL.put(e.label, e);
            BY_VALUE.put(e.value, e);
        }
    }

    UserRole(String label, int value, String[] permissions) {
        this.label = label;
        this.value = value;
        this.permissions = permissions;
    }

    public static int valueOfLabel(String label) {
        return BY_LABEL.get(label).value;
    }

    public static String labelOfValue(int value) {
        return BY_VALUE.get(value).label;
    }

    public static String[] permissionOfLabel(String label) {
        return BY_LABEL.get(label).permissions;
    }
}
