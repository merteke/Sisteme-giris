import java.util.*;



public class sistemeGiris {

    public static void main(String[] args){

        String userName,password,truePassword="1234567";

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanici adi:");
        userName = input.nextLine();
        System.out.println("Sifre:");
        password = input.nextLine();

        if(userName.equals("uzen1337")){

            if(password.equals(truePassword))
            {
                System.out.println("Giris Yapildi!");
            
            }
            else
            {
                System.out.println("Sifre hatali!");
                System.out.println("Sifrenizi Sifirlamak iset misiniz (Evet/Hayir)");
                String secenek;
                secenek=input.nextLine();

                if(secenek.equals("Evet"))
                {

                    System.out.println("Yeni sifrenizi giriniz(Yeni sifre eskisiyle ayni olamaz):");
                    String newPassword;
                    newPassword=input.nextLine();
                    if(newPassword.equals(truePassword))
                    {
                        System.out.println("Farkli bir sifre seciniz!");
                        
                    }
                    else{
                        System.out.println("Sifre olusturuldu!");
                        truePassword=newPassword;
                    }
                }
                else{
                    System.out.println("Tekrar giris yapmayi deneyiniz!");
                }
            }

        }
    }

}
