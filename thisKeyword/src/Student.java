class Student {
    int rollNo;
    String name;
    float fee;

    Student(int rollNo, String name, float fee){
        this.rollNo = rollNo;
        this.name = name;
        this.fee = fee ;
    }
    void display(){
        System.out.println(rollNo + " " + name + " " + fee);
    }
}
class TestThis{
    public static void main(String[] args) {
        Student s1 = new Student(111,"asru", 500);
        Student s2 = new Student(200,"sajol",700);
        s1.display();
        s2.display();
    }
}
