package day012;

import java.math.BigDecimal;

/**
 * 虚拟钱包接口层
 */
public class VirtualWalletController {
    // 通过构造函数或者IOC框架注入
    private VirtualWalletService virtualWalletService;

    public void credit(Long walletId, BigDecimal amount){} // 入账

    public void debit(Long walletId, BigDecimal amount){} // 出账

    public void transfer(Long fromWalletId, Long toWalletId, BigDecimal amount){} // 转账

    public BigDecimal getBalance(Long walletId){ // 查询余额
        return null;
    }

    // 省略查询transaction的接口
}
