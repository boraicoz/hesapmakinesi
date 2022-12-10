import java.util.Scanner;
public class HesapMakinesi {
    public static void plus(){
        Scanner in=new Scanner(System.in);
        int number=0,i=1,result=0;
        while(true){
            System.out.print(i++ +".sayi:");
            number=in.nextInt();
            if(number==0)
            {break;}
            result+=number;
        }
        System.out.println("Toplam:"+result);
    }
public static void minus(){
        int counter,number,result=0;
        Scanner in=new Scanner(System.in);
    System.out.print("Kac adet sayi gireceksin:");
        counter=in.nextInt();

 for(int i=1;i<=counter;i++){
     System.out.print(i +".sayi:");
     number=in.nextInt();
     if(i==1){
         result+=number;
         continue;
     }
     result-=number;

 }
    System.out.println("Fark:"+result);
}

public static void times(){
         int result=1,counter,number,i=1;
         Scanner in=new Scanner(System.in);
        do{
            System.out.print(i++ +".sayi:");
            number=in.nextInt();
            result*=number;
        }while(number!=1);
    System.out.println("Carpim:"+result);
}

public static void division(){
        int result=0,number,counter;
       Scanner in=new Scanner(System.in);
    System.out.print("Kac adet sayi gireceksin:");
       counter=in.nextInt();
       for(int i=1;i<=counter;i++)
    {
        System.out.print(i+".sayi:");
        number=in.nextInt();
        if(i!=1&&number==0)
        {
            System.out.println("Bolen 0 olamaz!");
            i--;
            continue;
        }
        if(i==1)
        {
         result=number;
            continue;
        }
        result/=number;
    }
    System.out.println("Bolum:"+result);
}
public static void power(){
        int taban,us,result=1;
        Scanner in=new Scanner(System.in);
    System.out.print("Taban degeri:");
       taban=in.nextInt();
    System.out.print("Us degeri:");
     us=in.nextInt();
     for(int i=1;i<=us;i++)
     {
     result*=taban;
     }
    System.out.println("Us alma:"+result);
    }
public static void factorial(){
        int number,result=1;
        Scanner in=new Scanner(System.in);
    System.out.print("Faktoriyeli alinacak sayi:");
    number=in.nextInt();
        for(int i=number;i>=1;i--)
        {
         result*=i;
        }
    System.out.println("Factorial:"+result);
    }
public static void mod(){
        Scanner in=new Scanner(System.in);
        int modnumber,modnumber2;
    System.out.print("Bolunen:");
      modnumber=in.nextInt();
    System.out.print("Bolen:");
    modnumber2=in.nextInt();

    System.out.println("Mod:"+(modnumber%modnumber2));
}
public static void rectangle(){
        int a,b;
       Scanner in=new Scanner(System.in);
    System.out.print("Dikdortgenin kisa kenari:");
    a=in.nextInt();
    System.out.print("Dikdortgenin uzun kenari:");
    b=in.nextInt();

    System.out.println("Alan:"+(a*b));
    System.out.println("Cevre:"+(2*(a+b)));
}


    public static void main(String[] args) {
        int secim;
       String menu="0- Cikis\n" +
               "1- Toplama İşlemi\n" +
               "2- Cıkarma Islemi\n" +
               "3- Carpma Islemi\n" +
               "4- Bolme Islemi\n" +
               "5- Uslu Sayi Hesaplama\n" +
               "6- Faktoriyel Hesaplama\n" +
               "7- Mod Alma\n" +
               "8- Dikdortgen Alan ve Cevre Hesabi";
        Scanner in=new Scanner(System.in);
        System.out.println(menu);

        while(true){
            System.out.print("Islem Sec:");
            secim=in.nextInt();
            if(secim==0)
            {
                break;
            }
              switch (secim)
              {
                  case 1:plus();
                  break;
                  case 2:minus();
                  break;
                  case 3:times();
                  break;
                  case 4:division();
                  break;
                  case 5:power();
                  break;
                  case 6:factorial();
                  break;
                  case 7:mod();
                  break;
                  case 8:rectangle();
                  break;
                  default:
                      System.out.println("Hatali secim yaptiniz!");
              }
        }
        System.out.println("Gule Gule");


    }
}
