package OOP;

class DatabaseManager {

    public void adddb(IDatabase db) {
        db.add();
    }
    public void updatedb(IDatabase db) {
        db.update();
    }
    public void getdb(IDatabase db) {
        db.get();
    }
    public void deletedb(IDatabase db) {
        db.delete();
    }


}
public class InterfaceMain {
    public static void main(String[] args) {

       // IMySQL my = new IMySQL();
       // my.add();  YERİNE =>>

        DatabaseManager dbm = new DatabaseManager();
        dbm.adddb(new IMySQL());
        dbm.adddb(new IOracle());
        dbm.updatedb(new IMySQL());


    }
}
