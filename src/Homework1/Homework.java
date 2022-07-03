package Homework1;

import java.util.concurrent.atomic.AtomicInteger;

public class Homework {

    public static void main(String[] args) {
// Напишите метод, который будет увеличивать каждый элемент массива на 10%
        int[] array = new int[10];

        int i;

        for (i = 0; i < 10; i++)

            i = array[i] * 10 %;

// Вывести н на экран все четные цифры от 1 до100, использовать остаток деления

        for (int x = 1; x <= 100; x++)

            if (x % 2 == 0)

                System.out.println(x);
// Вывести на экран все нечетные цтфры от 1 до 15, используя остаток от деления

        for (int x = 1; x <= 15; x++) {
            if (x % 2 != 0) {
                System.out.println(x);
            }
        }

        // Вывести на экран все четные цифры от 1 до 100, используя только цикл for

        int x;

        for (x = 0; x <= 100; x++) ;

        x += 2;


        // Посчитать сумму цифр от 20 до 200 и результат вывести на экран, использовать цикл for


        int sum = 0;

        int x;

        for (x = 20; x <= 200; x++) ;

        sum += x;

        System.out.println(sum);

        // Пройти циклом по числам от 1 до 12 и вывести названия месяца, соответствующее каждому числу, используя цикл и оператор
        // if else

        int m;
        if (m == 1) {
            System.out.println("January");
            if (m == 2) {
                System.out.println("Februry");
                if (m == 3) {
                    System.out.println("March");
                    if (m == 4) {
                        System.out.println("April");
                        if (m == 5) {
                            System.out.println("May");
                            if (m == 6) {
                                System.out.println("June");
                                if (m == 7) {
                                    System.out.println("July");
                                    if (m == 8) {
                                        System.out.println("August");
                                        if (m == 9) {
                                            System.out.println("September");
                                            if (m == 10) {
                                                System.out.println("October");
                                                if (m == 11) {
                                                    System.out.println("November");
                                                    if (m == 12) {
                                                        System.out.println("Desember");

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }


        // Обьявить 2 переменных целого типа. Необходимо поменять значения переменных так, чтобы значения первой оказалось во второй, а второй -в первой


        int c;
        int g;
        int j;
        int c = int g;
        int g = int j;
        int j = int c;

        //Напишите программу с тремя переменными целого типа, первым двум присвойте значения, а третей переменной присвойте их сумму
        //выведите значение третей переменной на экран


        int kg1=2;

        int kg2=4;

        int sum=kg1+kg2;

        System.out.println(sum);

// Напишите программу с тремя переменными целого типа. Определить какое из них наибольшее


     int pounds1= 2;

     int pounds2= 4;

     int pounds3= 7;

     if(pounds1>pounds2&&pounds1>pounds3){

         System.out.println(pounds1);

         else if(pounds2>pounds1&&pounds2>pounds3) {

             System.out.println(pounds2);

             else {

                 System.out.println(pounds3);
             }
         }
     }

// Напишите программу где двум строковым переменным присваиваются значения, третей строковой переменных присвойте конкатенацию
// двух предыдущих строк. Напечатать значение третей строковой переменной.

     String word1="cold";

     String word2="bear";

     System.out.println(word1+word2);

// Создайте программу с двумя переменными целого типа,присвойтеим значения, если первая переменная больше второй,то увеличте ее
// значение на 3, иначе увеличте значение второй переменной на на 8. В конце программы выведите значения обоих чисел на экран.


     int p=2;

     int y=5;

     if(p>y) {
         System.out.println(p*3);
         else {
             System.out.println(p*8);
         }

     }

// Выведите на экран все числа от 1 до 100 с помощью цикла for,while,do while

      for(i=1;i<100;i++);
      System.out.println(i+"");

//
      int i=1;

      while(i<101);
      System.out.println("i="+i);
      i++;

//

       int i=1;

       do {
           System.out.println("i="+i);

           i++;

           while(i<=101);
       }


 // Все элементы массива поделить на значение наибольшего элемента массива

        int m=array[];
       for(i=0;i<array.length;i++) {
           if (m < array[i]) ;
           m = array[i];
       }

           for(i=0;i<array.length;i++); {

               System.out.println(array[i]/m);


           }

 // Напишите программу, которая будет считать количество часов,минут и секунд в н-ном количестве суток.

        int s=172800;
        int sec=s%60;
        int m=s/60;
        int min=m%60;
        int h=m/60;
        int hours=h%60;

        System.out.println("час"+hours,"минут"+min,"секунд"+sec);


// Напишите метод переводящий рубли в доллары по заданному курсу.В качествеаргументов укажите кол-во рублей и курс

        double rub=100;
        double rubusd=0.3;
        double result = rub+rubusd;
        System.out.println(result);








    }








        }
    }

