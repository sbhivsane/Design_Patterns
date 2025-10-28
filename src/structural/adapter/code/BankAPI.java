package structural.adapter.code;

public interface BankAPI {

    void transferMoney(String sender,String reciver);

    void getPaymentStatus(String transactionId);
}
