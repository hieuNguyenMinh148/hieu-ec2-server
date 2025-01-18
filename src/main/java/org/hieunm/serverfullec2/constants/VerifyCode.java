package org.hieunm.serverfullec2.constants;

import lombok.Data;

@Data
public class VerifyCode {
    public static String CODE = "";

    public static String getCODE() {
        return CODE;
    }

    public static void setCODE(String CODE) {
        VerifyCode.CODE = CODE;
    }
}
