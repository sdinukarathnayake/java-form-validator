/*
2. Email should include @ symbol and only allow for "gmail" and "test.com" mails
3. Phone numbers must include 10 digits and first digit should be "0"
4. All users must be over 18 therefore birthday should be before 2006
5. NIC number must include 9 digits and should be ended with "V"
6. Student ID must include 10 characters and should be start with "IT"
7. Both password and confirm password must match and password should include one special character like "@", "#" or "$", at least one capital letter and a number.

 */
public class Validator {

    // check name fields are not empty
    public String isFirstNamesEmpty (String parameterFirstName) {

        String result = "Valid";

        if( parameterFirstName.isEmpty()) result = "Need to enter both first name and last name";

        return result;
    }


    // check email address is valid
    public  String isEmailValid (String parameterEmail) {
        String result = "Not a valid email";

        if(parameterEmail.contains("@")){
            result = "Valid";
        }

        return result;
    }

    public  String isEmailValidSender (String parameterEmail) {
        String result = "Not a valid email";

        if(parameterEmail.contains("@")){
            result = "Valid";
        }

        return result;
    }


    public  String isPhoneNoValid (String parameterPhone) {
        String result = "Valid";

        return result;
    }


    public  String isPhoneNoStartWithZero (String parameterPhone) {
        String result = "Valid";

        return result;
    }



    public  String isUserOverEighteen (String parameterBirthDay) {
        String result = "Valid";

        return result;
    }


    public  String isNICValid (String parameterNIC) {
        String result = "Valid";

        return result;
    }


    public  String isNICEndCorrectly (String parameterNIC) {
        String result = "Valid";

        return result;
    }

    public  String isStudentIdValid (String parameterStudentId) {
        String result = "Valid";

        return result;
    }

    public  String isStudentIdStartCorrectly (String parameterStudentId) {
        String result = "Valid";

        return result;
    }


    public  String isPasswordsMatch (String parameterPassword) {

        String result = "Valid";

        return result;
    }

    public  String isPasswordPatternCorrect (String parameterPassword) {

        String result = "Valid";

        return result;
    }






}
