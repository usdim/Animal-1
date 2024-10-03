//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Belka b1=new Belka("Пушистых красивый",1);

        b1.run(); // вызываем на экземляре метод

        Krot k1=new Krot("Обычный хвост ",3);

        k1.run(); // вызываем на экземляре метод

        //System.out.println(b1);


        }
    }


abstract class Animal{
    String type;
    int age;

    public abstract void run();


}
class Belka extends Animal{
    String hvost;
    int age;
    public Belka (String hvost,int age){
        this.hvost=hvost;
        this.age=age;
    }


    @Override
    public void run() {
        System.out.println("Белка прыгает по деревьям ");
        System.out.println(hvost+age);



    }
}

class Krot extends Animal{
    String hvost;
    int age;

    public Krot  (String hvost, int  age){
    this.hvost=hvost;
    this.age=age;


    }


    @Override
    public void run() {
        System.out.println("Крот роется в норе");

        System.out.println(hvost+age);



    }
}
