package day012;

import java.math.BigDecimal;

/**
 * 虚拟钱包交易实体
 */
public class VirtualWalletTransactionEntity {
    public void setAmount(BigDecimal amount) {}

    public void setCreateTime(long time) {}

    public void setType(TransactionType type) {}

    public void setFromWalletId(Long walletId) {}

    public void setToWalletId(Long walletId) {}
}
