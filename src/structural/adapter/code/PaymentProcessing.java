package structural.adapter.code;

public class PaymentProcessing {

    static void main() {

        String sender ="A";
        String reciver = "B";
        String transactionId ="12345";



        YesBank yesBank = new YesBank();
        yesBank.makePayment(sender,reciver);
        yesBank.checkPaymentStatus(transactionId);


        // now if say we have to move from YesBank to ICIC bank for some reason and ICIC bank have diffrent implemetation
        // we will have to rewrite out application code again hence instead of having the direct coupling with the
        // yesBank will have a interface

        BankAPI bankAPI = new YesBankAdapter();

        // now if we want to move to icic bank then we will have to change just the helper class
        // i.e BankAPI bankAPI = new ICICBankAdapter();  , rest all the methods will be as it is;

        bankAPI.transferMoney(sender,reciver);
        bankAPI.getPaymentStatus(transactionId);


    }


}
