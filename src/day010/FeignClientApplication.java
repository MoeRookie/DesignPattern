package day010;

/**
 * 伪装客户端操作类
 */
public class FeignClientApplication {
    public void demoFunction(FeignClient feignClient){
        //...
        feignClient.encode("");
        //...
    }

    public static void main(String[] args) {
        FeignClient feignClient = new CustomFeignClient();
        feignClient.encode("");
    }
}
