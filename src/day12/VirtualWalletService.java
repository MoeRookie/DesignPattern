package day12;

import java.math.BigDecimal;

/**
 * 虚拟钱包业务层
 */
public class VirtualWalletService {
    // 通过构造方法或者IOC框架注入
    private VirtualWalletRepository walletRepo; // 钱包库

    private VirtualWalletTransactionRepository transactionRepo; // 交易库

    public VirtualWallet getVirtualWallet(Long walletId){
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        VirtualWallet wallet = convert(walletEntity);
        return wallet;
    }

    public BigDecimal getBalance(Long walletId){
        return walletRepo.getBalance(walletId);
    }

    // @Transactional
    public void debit(Long walletId, BigDecimal amount){
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        VirtualWallet wallet = convert(walletEntity);
        wallet.debit(amount);
        VirtualWalletTransactionEntity transactionEntity = new VirtualWalletTransactionEntity();
        transactionEntity.setAmount(amount);
        transactionEntity.setCreateTime(System.currentTimeMillis());
        transactionEntity.setType(TransactionType.DEBIT);
        transactionEntity.setFromWalletId(walletId);
        transactionRepo.saveTransaction(transactionEntity);
        walletRepo.updateBalance(walletId, wallet.balance());
    }

    // @Transactional
    public void credit(Long walletId, BigDecimal amount){
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        VirtualWallet wallet = convert(walletEntity);
        wallet.credit(amount);
        VirtualWalletTransactionEntity transactionEntity = new VirtualWalletTransactionEntity();
        transactionEntity.setAmount(amount);
        transactionEntity.setCreateTime(System.currentTimeMillis());
        transactionEntity.setType(TransactionType.CREDIT);
        transactionEntity.setFromWalletId(walletId);
        transactionRepo.saveTransaction(transactionEntity);
        walletRepo.updateBalance(walletId, wallet.balance());
    }

    // @Transactional
    public void transfer(Long fromWalletId, Long toWalletId, BigDecimal amount){
        // ...跟基于贫血模型的传统开发模式的代码一样...
    }


    private VirtualWallet convert(VirtualWalletEntity walletEntity) {
        return null;
    }
}
