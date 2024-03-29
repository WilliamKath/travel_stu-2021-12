package com.zjtec.travel.util;

import com.alibaba.druid.sql.visitor.functions.Hex;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MsgDigestUtils {
    /**
     * SHA256 加密
     * @param str 明文
     * @return 密文
     */
    public static String encodeSHA256(String str){
        MessageDigest messageDigest;
        String encdeStr = "";
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] hash = messageDigest.digest(str.getBytes("UTF-8"));
            encdeStr = byte2Hex(hash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return encdeStr;
    }

    private static String byte2Hex(byte[] bytes){
        StringBuffer stringBuffer = new StringBuffer();
        String temp = null;
        for (int i=0;i<bytes.length;i++){
            temp = Integer.toHexString(bytes[i] & 0xFF);
            if (temp.length()==1){
                //1得到一位的进行补0操作
                stringBuffer.append("0");
            }
            stringBuffer.append(temp);
        }
        return stringBuffer.toString();
    }

    public static String pwdEncrypt(String pwd, String salt){
        //循环三次
        final int loop = 3;
        String pwdEnc = pwd;
        for (int i=0; i<loop; i++){
            pwdEnc = encodeSHA256(pwdEnc+salt);
        }
        return pwdEnc;
    }
}
