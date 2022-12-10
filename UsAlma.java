import java.util.Scanner;
public class UsAlma {

    public static int power(int taban,int us){
        if(us==1)
        {
            return taban;
        }


        return taban*power(taban,us-1);




    }







    public static void main(String[] args) {
        int taban,us;
        Scanner in=new Scanner(System.in);
        System.out.print("Taban:");
        taban=in.nextInt();
        System.out.print("Us:");
        us=in.nextInt();
        System.out.print(taban+"^"+us+":"+power(taban,us));
    }
}
