package day009;

import java.awt.*;

/**
 * 图片存储
 */
public interface ImageStore {
    String upload(Image image, String bucketName);
    Image download(String url);
}