package day012;

import java.math.BigDecimal;

/**
 * 虚拟钱包库层
 */
public class VirtualWalletRepository {

    /**
     * 获取虚拟钱包实体
     */
    public VirtualWalletEntity getWalletEntity(Long walletId) {
        return null;
    }

    /**
     * 获取余额
     */
    public BigDecimal getBalance(Long walletId) {
        return null;
    }

    /**
     * 更新余额
     */
    public void updateBalance(Long walletId, BigDecimal amount) {}
}
