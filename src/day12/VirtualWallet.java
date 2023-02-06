package day12;

import java.math.BigDecimal;

/**
 * 虚拟钱包
 * Domain领域模型(充血模型)
 */
public class VirtualWallet {
    private Long id;
    private Long createTime = System.currentTimeMillis();
    private BigDecimal balance = BigDecimal.ZERO;
    private boolean isAllowedOverdraft = true;
    private BigDecimal overdraftAmount = BigDecimal.ZERO;
    private BigDecimal frozenAmount = BigDecimal.ZERO;

    public VirtualWallet(Long preAllocatedId) {
        this.id = preAllocatedId;
    }

    public BigDecimal balance(){
        return this.balance;
    }

    public void freeze(BigDecimal amount){}
    public void unfreeze(BigDecimal amount){}
    public void increaseOverdraftAmount(BigDecimal amount){};
    public void decreaseOverdraftAmount(BigDecimal amount){};
    public void closeOverdraft(){}
    public void openOverdraft(){}

    public BigDecimal getAvailableBalance(){
        BigDecimal totalAvailableBalance = this.balance.subtract(frozenAmount);
        if (isAllowedOverdraft) {
            totalAvailableBalance = totalAvailableBalance.add(overdraftAmount);
        }
        return totalAvailableBalance;
    }

    public void debit(BigDecimal amount){
        BigDecimal totalAvailableBalance = getAvailableBalance();
        if (totalAvailableBalance.compareTo(amount) < 0) {
            // throw new InsufficientBalanceException(...);
        }
        this.balance = balance.subtract(amount);
    }

    public void credit(BigDecimal amount){
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            // throw new InvalidAmountException(...);
        }
        this.balance = balance.add(amount);
    }
}
