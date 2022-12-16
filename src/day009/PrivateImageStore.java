package day009;

import java.awt.*;

/**
 * 私有云图片存储
 * 不需要支持access token
 */
public class PrivateImageStore implements ImageStore{
    @Override
    public String upload(Image image, String bucketName) {
        generateBucketIfNotExisting(bucketName);
        //...上传图片到私有云...
        //...返回图片的url...
        return null;
    }

    @Override
    public Image download(String url) {
        //...从私有云下载图片...
        return null;
    }

    private void generateBucketIfNotExisting(String bucketName) {
        // ...创建bucket...
        // ...失败会抛出异常..
    }
}
