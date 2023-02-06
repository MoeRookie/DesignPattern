package day011;

/**
 * 用户控制层(跟抛出接口打交道)
 */
public class UserController {
    // 通过构造函数或者IOC框架注入
    private UserService userService;
    public UserVo getUserById(Long userId){
        UserBo userBo = userService.getUserById(userId);
        UserVo userVo = null; // ...convert userBo to userVo...
        return userVo;
    }
}
