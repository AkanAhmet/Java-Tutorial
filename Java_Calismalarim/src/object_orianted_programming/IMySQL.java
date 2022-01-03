package object_orianted_programming;

public class IMySQL implements IDatabase{

    @Override
    public void log() {
       //
    }

    @Override
    public void add() {
        System.out.println("MySQL ekleme");
    }

    @Override
    public void get() {
        System.out.println("MySQL sorgulama");
    }

    @Override
    public void update() {
        System.out.println("MySQL güncelleme");
    }

    @Override
    public void delete() {
        System.out.println("MySQL silme");
    }
}
