public class TestClass {
    public static void main(String[] args) {
        /*int marks=101;
        if (marks < 33){
            System.out.println("You are fail !!");
        }else if (marks >= 33 && marks < 40){
            System.out.println("Grade D ");
        }else if (marks >=40 && marks < 50){
            System.out.println("Grade C");
        }else if (marks >=50 && marks < 60){
            System.out.println("Grade B");
        }else if (marks >= 60 && marks < 70){
            System.out.println("Grade A-");
        }else if (marks >= 70 && marks < 80){
            System.out.println("Grade A");
        }else if(marks >= 80 && marks <=100){
            System.out.println("Grade A+");
        }else {
            System.out.println("Please Input valid marks");
        }*/
// Blood donate eligibility
        int age=12 , weight=30;
        if (age >=18){
            if (weight >=50){
                System.out.println("Your age is "+ age +" wight is "+ weight + ", You are eligible to donate blood");
            }else {
                System.out.println("Your age is "+ age +", Weight " + weight +", You are not eligible to donate blood !!");
            }
        }else {
            System.out.println("Your age is "+ age +", Weight " + weight +", You are not eligible to donate blood !!");
        }

    }
}