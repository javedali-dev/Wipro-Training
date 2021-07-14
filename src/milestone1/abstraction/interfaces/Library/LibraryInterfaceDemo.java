package milestone1.abstraction.interfaces.Library;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {


        //Test case1
        System.out.println("**********TEST CASE 1**************");
        KidUsers kidUser = new KidUsers();
        kidUser.age=10;
        kidUser.registerAccount();
        kidUser.bookType= "Kids";
        kidUser.requestBook();


        //Test case 2
        System.out.println("**********TEST CASE 2*************");
        KidUsers kiduser2 = new KidUsers();
        kiduser2.age =18;
        kiduser2.registerAccount();
        kiduser2.bookType="Fiction";
        kiduser2.requestBook();

        //Test case 3
        System.out.println("**********TEST CASE 3*************");
        AdultUser adultUser = new AdultUser();
        adultUser.age =5;
        adultUser.registerAccount();
        adultUser.bookType="Kids";
        adultUser.requestBook();

        //Test case 4
        System.out.println("**********TEST CASE 4*************");
        AdultUser adultUser2 = new AdultUser();
        adultUser2.age =23;
        adultUser2.registerAccount();
        adultUser2.bookType="Fiction";
        adultUser2.requestBook();
    }
}
