package structural.adapter.code;

public class ICICBank {

    public void transferMoney(long senderId,long reciverId){
        System.out.println("Sending Money from "+senderId+" senderId to "+reciverId+" reciverId");
    }

    public void checkPaymentStatus(long transactionId){
        System.out.println("Checking payment status for transactionId :"+transactionId);
    }
}
