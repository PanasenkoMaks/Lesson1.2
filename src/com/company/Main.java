package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task number one");
	byte b = -128;
    short s = 129;
    int i = 12131;
    long l = 12131242L;
    float f = 43.2f;
    double d = 2332.232;
    char c = 33; //'!'
    boolean bo = true;
 System.out.println( b + "\n" + s + "\n" + i + "\n" + l + "\n" + f + "\n" + d + "\n" + c + "\n" + bo);

    System.out.println("\n" + "Task number too");
      float boxer1 = 78.2f;
      float boxer2 = 82.7f;
      float sumWeight, differenceWeight;
      sumWeight = boxer1 + boxer2;
      differenceWeight = boxer2 - boxer1;
      System.out.println("Total weight of boxers: " + sumWeight);
      System.out.println("Boxer difference weight: " + differenceWeight);

      System.out.println("\n" + "Task number three");
      float bananas = (5 * 80);
      float milk = (2 * 105);
      float iceCream = (2 * 100);
      float eggs = (4 * 70);
      float result = ((bananas + milk + iceCream + eggs) / 1000);
      System.out.println("dish weight: " + result + "kg");

        System.out.println("\n" + "Task number four");
        float resultOne = (7000f / 250f);
        float resultToo = (7000f / 500f);
        System.out.println("Option one (250 gram/day): " + resultOne);
        System.out.println("Option too (500 gram/day): " + resultToo);
        System.out.println("Needed of average: " + ((resultToo + resultOne)/2));

        System.out.println("\n" + "Task number five");
        float masha, denis, kristina;
        masha = 67760;
        denis = 83690;
        kristina = 76230;
        float salaryM, salaryD, salaryK;
        salaryM = (masha * 1.1f);
        salaryD = (denis * 1.1f);
        salaryK = (kristina * 1.1f);
        float yearM, yearD, yearK, yearNewM, yearNewD, yearNewK;
        yearM = (masha * 12);
        yearD = (denis * 12);
        yearK = (kristina * 12);
        yearNewM = (salaryM * 12);
        yearNewD = (salaryD * 12);
        yearNewK = (salaryK * 12);
        System.out.println("Masha now gets: " + salaryM + "rub. " + "Annual income increased: " + (yearNewM- yearM));
        System.out.println("Denis now gets: " + salaryD + "rub. " + "Annual income increased: " + (yearNewD- yearD));
        System.out.println("Kristina now gets: " + salaryK + "rub. " + "Annual income increased: " + (yearNewK- yearK));

  }
  }
