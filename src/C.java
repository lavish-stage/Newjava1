public class C  {
    public static void main(String[] args) {
        int age = 14;
        if (age >= 18) {
            System.out.println("iam an adult");
        } else if (!(age < 18)) {
            System.out.println("im not an adult");
        } else {
            System.out.println("im still not an adult");

        }
        String message = age>=18 ?
                "Iam an adult" : "iam not an adult";
        System.out.println(message);






    }




}
