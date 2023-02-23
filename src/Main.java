import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz:");
        int d_yili=input.nextInt();
        String burc="";

        if(d_yili%12==0){
          burc="Maymun";
        } else if (d_yili%12==1) {
            burc="Horoz";
        }

        else if (d_yili%12==2) {
            burc="Köpek";
        }
        else if (d_yili%12==3) {
            burc="Domuz";
        }
        else if (d_yili%12==4) {
            burc="Fare";
        }
        else if (d_yili%12==5) {
            burc="Öküz";
        }
        else if (d_yili%12==6) {
            burc="kaplan";
        }
        else if (d_yili%12==7) {
            burc="tavşan";
        }
        else if (d_yili%12==8) {
            burc="Ejderha";
        }
        else if (d_yili%12==9) {
            burc="Yılan";
        }
        else if (d_yili%12==10) {
            burc="At";
        }
        else if (d_yili%12==11) {
            burc="Koyun";
        }
        else {
            System.out.println("Hatalı giriş.");
        }
        System.out.println("Çin zodyağı burcunuz:"+burc);
    }
}