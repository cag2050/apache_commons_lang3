package com.cag;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsDemo {
    public static void main(String[] args) {
        System.out.println("isBlank = " + StringUtils.isBlank("aa"));
        System.out.println("trim = " + StringUtils.trim("  aa \t  "));
        System.out.println("strip = " + StringUtils.strip(" \t  aa  \n "));
    }
}
