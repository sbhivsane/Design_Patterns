package creational.singleton;

import java.util.concurrent.locks.ReentrantLock;

public class DbConnection {

    private static DbConnection dbConnection = null;
    private static ReentrantLock lock = new ReentrantLock();

    private DbConnection(){};

    public static DbConnection getInstance(){
        if(dbConnection==null){
            lock.lock();
            if(dbConnection==null)
                dbConnection = new DbConnection();
            lock.unlock();
        }
        return dbConnection;
    }
}
