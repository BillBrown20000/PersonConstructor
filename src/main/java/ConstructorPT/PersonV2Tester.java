package ConstructorPT;

public class PersonV2Tester {
    public static void main(String[] args) {
    PersonV2 Person1 = new PersonV2("William",21,"Basketball","Web Developer",85000);
        System.out.println(Person1.PrintMethod());
    PersonV2 Person2 = new PersonV2("Donald",33,"Baseball","Secret Service", 100000);
        System.out.println(Person2.PrintMethod());
    PersonV2 Person3 = new PersonV2("Charles",19,"Soccer","Hacker",150000);
        System.out.println(Person3.PrintMethod());
    Person2.setSalary(200000);
        System.out.println(Person2.PrintMethod());

        System.out.println(Person1.PrintMethod());
        System.out.println(Person1.yearlybonus(15000));
    }
}

