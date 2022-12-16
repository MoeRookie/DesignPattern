package day010;

/**
 * 自定义伪装客户端
 */
public class CustomFeignClient extends FeignClient{
    @Override
    public void encode(String url) {
        // ...重写encode的实现...
    }
}
