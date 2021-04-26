class Animal {
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking....");
    }
}

class BabyDog extends Dog{
    int weep(){
        System.out.println("Weeping ....");
        return 0;
    }
}
class TestInheritance{
    public static void main(String[] args) {
        BabyDog dog = new BabyDog();  //casting
        dog.weep();
        dog.bark();
        dog.eat();

        int a = 4;
        long b = 10l;
        float c = 20.5f;
        double d = 50.0 ;

        //a =(int) b;
        b = a;
        String  s = "1234";
        Integer h = 40;
       int k = Integer.parseInt(s);
        System.out.println(k);
       // System.out.println();
    }

}
// casting for int,long flot, double,
//String Methods ,
// arry,loop, list, map, thread, multiThread,\
// ** redis, RabbitMQ, mySQL(steps)
