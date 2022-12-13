------------------------------------------------------------------------------------
                  *code:1*
public class Salary {
    public static void main(String[] args) {
        int age = 25;
        int ac = 500;
        if (age >= 21 & age <= 31) {
            ac = ac + 10000;
            System.out.println(ac);
        } else if (age >= 50 & age <= 70) {
            ac = ac + 5000;
            System.out.println(ac);
        } else {
            System.out.println(ac);
            System.out.println("User is not Eligibile for this Scheme");
        }
    }
}


Output:-
    10500
------------------------------------------------------------------------------------
                  *code:2*
public class Salary {
    public static void main(String[] args) {
        int age = 50;
        int ac = 500;
        if (age >= 21 & age <= 31) {
            ac = ac + 10000;
            System.out.println(ac);
        } else if (age >= 50 & age <= 70) {
            ac = ac + 5000;
            System.out.println(ac);
        } else {
            System.out.println(ac);
            System.out.println("User is not Eligibile for this Scheme");
        }
    }
}


Output:-
    5500
------------------------------------------------------------------------------------
                  *code:3*
public class Salary {
    public static void main(String[] args) {
        int age = 75;
        int ac = 500;
        if (age >= 21 & age <= 31) {
            ac = ac + 10000;
            System.out.println(ac);
        } else if (age >= 50 & age <= 70) {
            ac = ac + 5000;
            System.out.println(ac);
        } else {
            System.out.println(ac);
            System.out.println("User is not Eligibile for this Scheme");
        }
    }
}


Output:-
    500
    User is not Eligibile for this Scheme
