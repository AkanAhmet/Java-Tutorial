package OOP;
// interface classlarının isimlerinin başına I getirilir anlaşılsın diye.
// inheritance(extends) den farkı, obje oluşturulamaz(implements).
// implemente etmek demek imzası olan tüm metodları oluşturmak zorunda olmak demektir.ü

public interface IDatabase {
     void log(); // Gövdesiz fonksiyon. Bunların sonuna ; konur, imza denir.

    void add();
    void get();
    void update();
    void delete();



}
