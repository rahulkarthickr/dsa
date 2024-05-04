public class Conditions {
    public static void main(String[] args) {
        int salary = 1000;
        if (salary >= 10000) { // if-else
            salary += 2000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);

        if (salary >= 10000) { // multiple if-else
            salary += 2000;
        } else if (salary >= 20000) {
            salary += 3000;
        } else {
            salary += 1000;
        }
    }
}
