package dtos;

public class LoginDto {
    private String username;
    private String hashedPassword;

    public LoginDto(String username, String hashedPassword){

        this.username = username;
        this.hashedPassword = hashedPassword;
    }

    public String getUsername() {
        return username;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }
}
