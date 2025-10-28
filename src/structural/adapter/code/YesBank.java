package structural.adapter.code;

public class YesBank {

    public void makePayment(String sender,String reciver){
        System.out.println("Sending money from "+sender+" to "+reciver);
    }

    public void checkPaymentStatus(String transactionId){
        System.out.println("Checking payment status for transactionId : "+transactionId);
    }
}
