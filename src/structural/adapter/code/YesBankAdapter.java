package structural.adapter.code;

public class YesBankAdapter implements BankAPI{
    YesBank yesBank = new YesBank();

    @Override
    public void transferMoney(String sender, String reciver) {
        yesBank.makePayment(sender,reciver);
    }

    @Override
    public void getPaymentStatus(String transactionId) {
        yesBank.checkPaymentStatus(transactionId);
    }
}
