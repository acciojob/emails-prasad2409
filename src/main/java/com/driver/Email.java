package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character

        if(oldPassword.equals(password)){
            if (isValid(newPassword)){
                System.out.println("Password changed successfully");
                this.password = newPassword;
            }
            else System.out.println("The new Password is InValid");
        }
        else {
            System.out.println("The given password doesn't match current password");
        }
    }
    private Boolean isValid(String password){
        if(password.length() >= 8){
            int upper = 0,lower =0, digit =0,special =0;
            for(int i=0;i<password.length();i++){
                char c = password.charAt(i);
                if(c >= 'A' && c <= 'Z') upper++;
                else if(c>='a' && c<='z') lower++;
                else if (c>='0' && c<='9') digit++;
                else special++;
            }
            return upper >= 1 && lower >= 1 && digit >= 1 && special >= 1;
        }
        return false;
    }
}
