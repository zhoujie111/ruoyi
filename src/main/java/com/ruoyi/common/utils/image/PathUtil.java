package com.ruoyi.common.utils.image;

import java.io.File;

public class PathUtil {
    public static final String separator = System.getProperty("file.separator");

    /**
     * 获取图片存储的服务器根目录
     * 以windows为例 D:/software/apache-tomcat-8.5.42/upload
     * @return
     */
    // todo 图片根路径
    public static String getImageBasePath(){
        String baseImagePath = "";
        if(System.getProperty("os.name").toLowerCase().startsWith("win")){
            baseImagePath = "D:/ruoyi/uploadPath/";
        }else{
            baseImagePath = "/Users/zhoujie/images/";
        }
        return baseImagePath.replace("/",separator);
    }

    //如果目标路径不存在 自动创建
    public static void makeDirPath(String targetAddr) {
        String realFileParentPath = PathUtil.getImageBasePath() + targetAddr;
        File dirPath = new File(realFileParentPath);
        if (!dirPath.exists()) {
            dirPath.mkdirs();
        }
    }

}
