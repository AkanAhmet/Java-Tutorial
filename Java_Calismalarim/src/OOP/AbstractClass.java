package OOP;
// Abstraction=> Soyutlama demektir. İç detaylar gizlenerek sadece işlev gösterilir
// mesela araba sürerken sadece pedal ve direksiyonu kullanırız, motor ve yakıtı ,yüzlerce parça hakkında bilgimiz yoktur.
// ABSTRACTCLASS lar hem gövdesiz hem gövdeli fonksiyonları tutabilir. Constructor içerebilir.
//örneğin, interface için kullandığımız add metodu tüm databaseler için ortak olsun,
// bunu gövdeli bir şekilde yazarız diğer(update,get) metodları gövdesiz bırakırız.
public abstract class AbstractClass {
    public void add() {
        System.out.println("eklendi");
    }

    public void delete() {
        System.out.println("silindi");
    }
    abstract void update(); // extends eden sınıf bunları oluşturmalı.
    abstract void get();

}
