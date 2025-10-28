package structural.adapter.code;

public class ICICBankAdapter implements BankAPI{

    ICICBank icicBank = new ICICBank();

    @Override
    public void transferMoney(String sender, String reciver) {
        icicBank.transferMoney(Long.parseLong(sender),Long.parseLong(reciver));
    }

    @Override
    public void getPaymentStatus(String transactionId) {
        icicBank.checkPaymentStatus(Long.parseLong(transactionId));
    }
}
