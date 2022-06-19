package seminars;
public class task001_byMihail {
    public static double pow(double num, int pow){

        if(pow == 0 && num == 0)
            System.out.println("не определено");
        
        if(pow == 0 || num == 1){
            return 1;
        }
        
        if (pow < 0){
            pow = -pow;
            num = 1/num;
        }

        double result = 1;

        for (int i = 0; i < pow; i++) {
            result *=num;
        }
        return result;
    }

}
