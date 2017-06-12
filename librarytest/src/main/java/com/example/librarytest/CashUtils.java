package com.example.librarytest;

import android.support.annotation.NonNull;

/**
 * Created by kkkk on 2017/6/12.
 * For Arr Test
 */

public class CashUtils {
    /*
    把真实的Double数值转化为以分为单位的整数
     */
    public static long Cents2Long(Double val) {
        return (long) (val * 100);
    }


    /*
    把Double转化为只有两位小数精度的字符串
    格式如下: 123.45
     */
    public static String Double2String(Double val) {
        long i = CashUtils.Cents2Long(val);
        String str = String.valueOf(i);
        return Cents2StringImpl(str);
    }

    /*
    把以分为单位的整数转化为只有两位小数精度的字符串
    格式如下: 123.45
    */
    public static String Cents2String(long val) {
        String str = String.valueOf(val);
        return Cents2StringImpl(str);
    }

    private static String Cents2StringImpl(@NonNull String str) {
        String text;
        if (str.length() == 0) {
            return "";
        }
        if (str.length() > 2) {
            text = str.substring(0, str.length() - 2) + "." + str.substring(str.length() - 2, str.length());
        } else {
            if (str.length() == 1) {
                text = "0.0" + str;
            } else {
                text = "0." + str;
            }
        }
        return text;
    }
}
