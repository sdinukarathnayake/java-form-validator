public class Main {
    public static void  main(String[] args) {

        // user inputs
        String firstName = "";
        String lastName = "Rathnayake";
        String email = "dinuka@test.com";
        String phoneNumber = "0712345678";
        String birthDay = "2000/01/01";
        String nic = "123456789V";
        String studentId = "IT2200626";
        String address = "No. 07, Temple Road, Colombo 07";
        String password = "Test@123";
        String confirmPassword = "Test@123";

        // validator
        Validator validatorObject = new Validator();

        // results and output
        System.out.println("User details validate results : ");
        System.out.println("\tFirst Name : " + validatorObject.isFirstNamesEmpty(firstName));
        System.out.println("\tLast Name  : ");
        System.out.println("\tEmail      : ");
        System.out.println("\tPhone No.  : ");
        System.out.println("\tBirthday   : ");
        System.out.println("\tNIC        : ");
        System.out.println("\tStudent Id : ");
        System.out.println("\tAddress    : ");
        System.out.println("\tPassword   : ");

    }
}
