package bdd_final_project.framework.utility;

public class DataProvider {
    public String getRandomEmail() {
        String name = "ZiaMustafa";
        String email = "@yahoo.com";
        String num = "";
        for (int i = 0; i <= 4; i++) {
            num += (int) (Math.random() * 10);
        }
        return name + num + email;
    }
}