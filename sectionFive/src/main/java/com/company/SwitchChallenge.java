package com.company;

public class SwitchChallenge {
    public static void main(String[] args) {
//        char switchValue = 'A';
//
//        switch(switchValue){
//            case 'A':
//                System.out.println("its A");
//                break;
//            case 'B':
//                System.out.println("its B");
//                break;
//            case 'C':
//                System.out.println("its C");
//                break;
//            case 'D':
//                System.out.println("its D");
//                break;
//                default:
//                    System.out.println("enter a char dumbass");
//        }

//        int findValue = 0;
//        int counter = 0;
//
//        for(int i = 1; i <= 1000; i++){
//            if((i % 3 == 0) && (i % 5 == 0)){
//                System.out.println(i);
//                findValue += i;
//                counter++;
//
//
//            }else if(counter == 5){
//                System.out.println(findValue);
//                break;
//            }
//
//        }
//
                sumOdd(-1,100);
    }
    public static boolean isOdd(int number){
        if(number < 0){
//            System.out.println("false");
            return false;
        }
        if(number % 2 == 1){
//            System.out.println("true");
            return true;
        }

        return false;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if(start < 0 && end < 0 && end < start){
            return -1;
        }
        for(int i = start; i < end; i++){
            if(isOdd(i) == true){
                sum += i;
            }
        }
//        System.out.println(sum);
        return sum;
    }

}
