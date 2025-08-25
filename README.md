# Java User Input Form Validator

Getting user inputs as follows;

    String firstName = "Dinuka";
    String lastName = "Rathnayake";
    String email = "dinuka@test.com";
    String phoneNumber = "0712345678";
    String birthDay = "2000/01/01";
    String nic = "123456789V";
    String studentID = "IT22123456";
    String address = "No. 07, Temple Road, Colombo 07";
    String password = "Test@123";
    String confirmPassword = "Test@123";

### For the validations
1. Name fields are required
2. Email should include @ symbol and only allow for "gmail" and "test.com" mails
3. Phone numbers must include 10 digits and first digit should be "0"
4. All users must be over 18 therefore birthday should be before 2006
5. NIC number must include 9 digits and should be ended with "V"
6. Student ID must include 10 characters and should be start with "IT"
7. Both password and confirm password must match and password should include one special character like "@", "#" or "$", at least one capital letter and a number.