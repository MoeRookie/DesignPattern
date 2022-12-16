package day009;

import java.awt.*;

/**
 * ImageStore的使用举例
 */
public class ImageProcessingJob {
    public static final String BUCKET_NAME = "private_image_bucket";

    public void process(){
        Image image = null; // 处理图片，并封装为Image对象
        ImageStore imageStore = new PrivateImageStore();
        imageStore.upload(image, BUCKET_NAME);
    }
}
