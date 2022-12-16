package day009;

import java.awt.*;

/**
 * AliyunImageStore类的使用举例
 */
public class ImageProcessingJob0 {
    public static final String BUCKET_NAME = "ai_image_bucket";
    //...省略其他无关代码...
    public void process(){
        Image image = null; // 处理图片,并封装为Image对象
        AliyunImageStore0 imageStore = new AliyunImageStore0(/* 省略参数 */);
        imageStore.createBucketIfNotExisting(BUCKET_NAME);
        String accessToken = imageStore.generateAccessToken();
        imageStore.uploadToAliyun(image, BUCKET_NAME, accessToken);
    }
}
