package day011;

/**
 * 用户服务层(跟业务打交道)
 * Service+BO(Business Object)
 */
public class UserService {
    //通过构造函数或者IOC框架注入
    private UserRepository userRepository;
    public UserBo getUserById(Long userId){
        UserEntity userEntity = userRepository.getUserById(userId);
        UserBo userBo = null; // ...convert userEntity to userBo...
        return userBo;
    }
}
