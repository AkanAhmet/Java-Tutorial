package OOP;

public class InnerClass {

    public static void main(String[] args) {
        Robot rt = new Robot(5);
    }

}


class Robot{
    int id;

    public Robot(int id) {
        this.id = id;
        Brain b = new Brain();
        b.think();
    }

    private class Brain{  // private tanımlanabilir ve bir üstündeki sınıfın değişkenlerini görebilir.
        public void think() {
            System.out.println(id+"  Thinking..");
        }

    }
}