package creational.singleton;

public class Client {
    static void main() {
        DbConnection db1 = DbConnection.getInstance();
        DbConnection db2 = DbConnection.getInstance();
        if(db1==db2)
            System.out.println("both the object are same with reffrence as : "+db1+" and "+db2);
    }
}
