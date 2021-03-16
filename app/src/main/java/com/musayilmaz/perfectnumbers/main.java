package com.musayilmaz.perfectnumbers;



public class main {

    public static void main(String[] args) {



        int sum = 0;

        for (int i = 2; i<=2147483647; i++) {

            for (int z = i/2; z>=1; z-- ) {

                   int  k = z ;

                if (i % k == 0) {

                    sum += k;


                }


            }

            if (sum==i) {

                System.out.println(i);
            }

            sum=0;
        }



    }

}
