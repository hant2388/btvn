package BTVN_hant;

import java.util.Scanner;

public class Lesson3 {
    public static void main (String[] args){
        // tinh tong so phut
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("Mời bạn nhập vào số giờ: ");
//        int soGio = scanner.nextInt();
//        System.out.println("Mời bạn nhập vào số phút: ");
//        int soPhut = scanner.nextInt();
//        int tongPhut = soGio*60 + soPhut;
//        System.out.println("Tổng số phút là: " + tongPhut);
        // cho phép nhập password max 3 lần
//        String pwdChinhXac = "test123";
//        Scanner scanner1= new Scanner(System.in);
//        for (int i = 0; i<3; i++){
//            System.out.println("Mời bạn nhập pass word: ");
//            String password = scanner1.nextLine();
//            if(password == pwdChinhXac) {
//                System.out.println("Bạn nhập password chính xác");
//                break;
//            }
//        }

        //substring
//        String myStr = "100 minutes";
//        String myStr1 = "1234nacd5678";
//        System.out.println(myStr.substring(0,3));
//        System.out.println(myStr1.substring(0,4)+myStr1.substring(8,12));


        //
        String url = "https://google.com.vn";
        if(url.contains("https")) {
            System.out.println("URL này sử dụng HTTPS");
        }
    }

}
