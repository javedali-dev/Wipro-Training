package milestone1.abstraction.interfaces.Library;

public class AdultUser implements LibraryUser{
    int age;
    String bookType;

    @Override
    public void registerAccount() {
        if (age >12 )
            System.out.println("You have successfully registered under a Adult Account");
        else
            System.out.println("Sorry, Age must be Greater than 12 to register as a Adult");
    }

    @Override
    public void requestBook() {
        if(bookType.equals("Fiction"))
            System.out.println("Book Issued successfully, please return the book within 7 days");
        else
            System.out.println("Oops, you are allowed to take only adult Fiction books");
    }
}
