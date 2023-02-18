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
        if(oldPassword == getPassword() && newPassword.length() >= 8){
            int upper = 0,lower =0, digit =0,special =0;
            for(int i=0;i<newPassword.length();i++){
                char c = newPassword.charAt(i);
                if(c >= 65 && c <= 90) upper++;
                else if(c>=97 && c<=122) lower++;
                else if (c>=48 && c<=57) digit++;
                else special++;
            }
            if(upper >=1 && lower >=1 && digit >=1 && special>=1){
                this.password = newPassword;
            }
        }
    }
}
