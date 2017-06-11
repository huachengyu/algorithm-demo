package com.algorithm.demo.string;

/**
 * Created by IntelliJ IDEA.
 *
 * @author huacy
 * @date 2017/06/11
 */
public class StringMatch {

    public static void main(String[] args) {
        String originS = "woaizhongguo";
        String matchedS = "zhong";
        // 坐标0开始
        System.out.println(forceMatch(originS, matchedS));
    }

    /**
     * @param originS  长字符串
     * @param matchedS 要匹配的字符串
     * @return 匹配字符在长字符串中的位置
     */
    private static int forceMatch(String originS, String matchedS) {

        char[] originArray = originS.toCharArray();
        char[] matchedArray = matchedS.toCharArray();

        int originLen = originS.length();
        int matchedLen = matchedS.length();

        int i = 0, j = 0;
        while (i < originLen && j < matchedLen) {
            if (originArray[i] == matchedArray[j]) {
                // 相等则继续位移比较(需要同时移位)
                i++;
                j++;
            } else {
                // 不相等则长字符串回到原点,重新比较
                i = i - j + 1;
                j = 0;
            }
        }
        // 匹配字符串完全找到
        if (j == matchedLen) {
            return i - j;
        } else {
            return -1;
        }
    }
}
