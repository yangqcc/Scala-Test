package com.yqc.function;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yangqc on 2017/7/14.
 */
public class IOTest {

    static String[] titles = {"标题】", "作者】", "作者单位】", "出处】", "国省市名】"};
    static String name = "不详";
    /**
     * 华东
     */
    static String[] HD = {"上海", "江苏", "浙江", "安徽", "福建", "江西", "山东", "台湾"};

    /**
     * 华北
     */
    static String[] HB = {"北京", "天津", "山西", "河北", "内蒙古"};

    /**
     * 华中
     */
    static String[] HZ = {"河南", "湖北", "湖南"};

    /**
     * 华南
     */
    static String[] HN = {"广东", "广西", "海南", "香港", "澳门"};

    /**
     * 西南
     */
    static String[] XN = {"四川", "贵州", "云南", "重庆", "西藏"};

    /**
     * 西北
     */
    static String[] XB = {"陕西", "甘肃", "青海", "宁夏", "新疆"};

    /**
     * 东北
     */
    static String[] DB = {"黑龙江", "吉林", "辽宁"};

    static Map<String, String[]> map;

    static {
        map = new HashMap<>();
        map.put("华北", HB);
        map.put("华东", HD);
        map.put("华南", HN);
        map.put("华中", HZ);
        map.put("西北", XB);
        map.put("西南", XN);
        map.put("东北", DB);
    }

    public static void traverseFolder2(String path, int i) throws IOException {
        File file = new File(path);
        if (file.exists()) {
            File[] files = file.listFiles();
            if (files.length == 0) {
                System.out.println("文件夹是空的!");
                return;
            } else {
                String dstFile = "";
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                        i = 0;
                       /* String p = file2.getAbsolutePath().replace("C:\\Users\\yangqc\\Desktop", "C:").replace(" ", "_");
                        File destFile = new File(p);
                        if (!destFile.exists()) {
                            destFile.mkdir();
                        }*/
                        traverseFolder2(file2.getAbsolutePath(), 0);
                    } else {
                        BufferedReader in = null;
                        BufferedWriter out = null;
                        try {
                            if (i == 0) {
                                dstFile = file2.getAbsolutePath().replace("C:\\Users\\yangqc\\Desktop", "C:").replace(" ", "_");
                                File newFile = new File(dstFile);
                                if (!newFile.getParentFile().exists()) {
                                    newFile.getParentFile().mkdirs();
                                    i++;
                                }
                                if (!newFile.exists()) {
                                    newFile.createNewFile();
                                }
                            }
                            in = new BufferedReader(new FileReader(file2));
                            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dstFile, true)));
                            String line;
                            int k = 0;
                            while ((line = in.readLine()) != null) {
                                if (line.contains(".") && !line.contains("】")) {
                                    out.newLine();
                                    k = 0;
                                    continue;
                                }
                                try {
                                    String line1 = "";
                                    if (line.trim().length() == 0) {
                                        continue;
                                    }
                                    line = line.trim();
                                    for (; k < titles.length; k++) {
                                        if (!line.contains(titles[k])) {
                                            out.write(name + "*");
                                        } else {
                                            break;
                                        }
                                    }
                                    if (line.contains("出处】:")) {
                                        String[] line2 = line.split("】:");
                                        String[] line3 = line2[1].split(";");
                                        for (int j = 0; j < line3.length; j++) {
                                            if (j == 1 && line3[j].contains(".")) {
                                                line3[j] = line3[j].replace('.', '/').split("/")[0];
                                            }
                                            line1 += line3[j] + "*";
                                        }
                                        line1 = line1.substring(0, line1.length() - 1);
                                        System.out.println(line1);
                                    } else {
                                        String[] line2 = line.split("】:");
                                        if (line2.length == 1) {
                                            continue;
                                        }
                                        if (line.contains("国省市名】")) {
                                            if (!line2[1].equals("") && !line2[1].equals("不详") && !line2[1].equals("无")) {
                                                line1 += line2[1] + "*" + getPlace(line2[1]);
                                            }
                                        } else {
                                            line1 = line2[1];
                                        }
                                    }
                                    if (!line1.contains("\\r") || !line1.contains("\\n")) {
                                        line1 += "*";
                                    }
                                    out.write(line1);
                                    k++;
                                } catch (Exception e) {
                                    throw e;
                                }
                            }
                        } catch (Exception e) {
                            // TODO: handle exception
//                            e.printStackTrace();
                            throw e;
                        } finally {
                            if (in != null) {
                                try {
                                    in.close();
                                } catch (Exception e) {
                                    // TODO: handle exception
                                    e.printStackTrace();
                                }
                            }

                            if (out != null) {
                                try {
                                    out.close();
                                } catch (Exception e) {
                                    // TODO: handle exception
                                    e.printStackTrace();
                                }
                            }
                        }
                    }

                    System.out.println("文件:" + file2.getAbsolutePath());
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
    }

    static String getPlace(String place) {
        for (Map.Entry<String, String[]> entry : map.entrySet()) {
            for (String p : entry.getValue()) {
                if (place.equals(p)) {
                    return entry.getKey();
                }
            }
        }
        System.out.println(place + "***************");
        return place;
    }

    public static void main(String[] args) throws IOException {
        String srcPath = "C:\\Users\\yangqc\\Desktop\\原始表格 7.15";
      /*  String s = "C:\\原始表格_7.15\\中华医学会期刊";
        File file = new File(s);
        System.out.println(file.mkdir());*/
        traverseFolder2(srcPath, 0);
//        System.out.println("2001.09.10".replace('.', '/').split("/")[0]);

    }
}
