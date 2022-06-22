package org.example.check;

import java.util.Date;

/**
 * 字符串问题验证
 */
public class StringCheck {

    public static void main(String[] args) {
        new StringCheck().appendAndFormatCheck();
    }


    /**
     * "+" 与 format 效率差对比
     * 结论：当数据量大的时候，效率差 “+” 比 format 要高十倍左右，数据量小能达到几十倍。
     */
    public void appendAndFormatCheck(){
        String a = "%s_%s";
        Long beginTime = new Date().getTime();
        for (int i = 0; i < 1000000000; i++) {
            a = "1" + i;
        }
        Long endTime = new Date().getTime();
        System.out.println("append: " + (endTime - beginTime));

        Long beginTime1 = new Date().getTime();
        for (int i = 0; i < 1000000000; i++) {
            String.format(a, "1",i);
        }
        Long endTime1 = new Date().getTime();
        System.out.println("format: " + (endTime1 - beginTime1));

        StringBuilder builder;
        Long beginTime2 = new Date().getTime();
        for (int i = 0; i < 1000000000; i++) {
            builder = new StringBuilder();
            builder.append("1");
            builder.append(i);
        }
        Long endTime2 = new Date().getTime();
        System.out.println("Builder: " + (endTime2 - beginTime2));

        StringBuffer buffer;
        Long beginTime3 = new Date().getTime();
        for (int i = 0; i < 1000000000; i++) {
            buffer = new StringBuffer();
            buffer.append("1");
            buffer.append(i);
        }
        Long endTime3 = new Date().getTime();
        System.out.println("Buffer: " + (endTime3 - beginTime3));
    }

}
