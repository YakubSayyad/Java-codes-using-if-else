public class Salary {
    public static void main(String[] args) {
        int age = 71;
        int ac = 500;
        if (age >= 21 & age <= 31) {
            ac = ac + 10000;
            System.out.println(ac);
        } else if (age >= 50 & age <= 70) {
            ac = ac + 5000;
            System.out.println(ac);
        } else {
            System.out.println(ac);
            System.out.println("User not Eligibile for this Scheme");
        }
    }
}
