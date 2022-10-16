package problem_5;


public class UserRegistration {

    void registerUser(String username, String userCountry) throws InvalidCountryException {
        if(userCountry.equals("India")) {
            System.out.println("User registration done successfully");
        }else {
            InvalidCountryException ince=new InvalidCountryException("User Outside India cannot be registered");
            throw ince;
        }
    }
}
