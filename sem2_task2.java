// Сократить строку вида aaabbbssskkk до a3b3s3k3

public class sem2_task2 {
    public static void main(String[] args) {
        String str = "aaabbbssskkk";
        int count = 1;
        String strNew = "";
        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i - 1) == str.charAt(i)) {
                count++;
            } else {
                strNew += str.charAt(i - 1) + Integer.toString(count);
                count = 1;
            }
            if (i == str.length() - 1) {
                strNew += str.charAt(i - 1) + Integer.toString(count);
            }
        }
        System.out.println(strNew);
    }
}
