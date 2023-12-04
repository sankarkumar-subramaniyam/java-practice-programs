package leetcode;

import java.util.HashMap;

// https://leetcode.com/problems/integer-to-english-words/solutions/2997480/solution/
public class IntegerToEnglishWords {


    private final String[] belowTwenty = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    private final HashMap<Integer, String> cache = new HashMap<>();

    public static void main(String[] args) {
        IntegerToEnglishWords intToWords = new IntegerToEnglishWords();

        System.out.println("For 1: " + intToWords.numberToWords(1));
        System.out.println("For 11: " + intToWords.numberToWords(11));
        System.out.println("For 111: " + intToWords.numberToWords(111));
        System.out.println("For 11111: " + intToWords.numberToWords(11111));
        System.out.println("For 111111: " + intToWords.numberToWords(111111));
        System.out.println("For 1111111: " + intToWords.numberToWords(1111111));
    }

    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        return helper(num);
    }

    private String helper(int num) {

        if (cache.containsKey(num)) {
            return cache.get(num);
        }

        StringBuilder result = new StringBuilder();
        if (num < 20) {
            result.append(belowTwenty[num]);
        } else if (num < 100) {
            result.append(tens[num / 10]).append(" ").append(belowTwenty[num % 10]);
        } else if (num < 1000) {
            result.append(helper(num / 100)).append(" Hundred ").append(helper(num % 100));
        } else if (num < 1000000) {
            result.append(helper(num / 1000)).append(" Thousand ").append(helper(num % 1000));
        } else if (num < 1000000000) {
            result.append(helper(num / 1000000)).append(" Million ").append(helper(num % 1000000));
        } else {
            result.append(helper(num / 1000000000)).append(" Billion ").append(helper(num % 1000000000));
        }
        cache.put(num, result.toString().trim());
        return result.toString().trim();
    }
}


/*
    static HashMap<String,String> intToWords = new HashMap<>();
        

    public String numberToWords(int num) {

        int noOfDigits = String.valueOf(num).length();
        StringBuilder words = new StringBuilder();

        if(noOfDigits == 1){
            return intToWords.get(String.valueOf(num));
        }

        if(noOfDigits == 2){
            return convert2Digits(num);
        }

        if(noOfDigits == 3){
            return convert3Digits(num);
        }

        if(noOfDigits > 3){

            int nextNum = num;
            int noofThousends = 0;
            while(nextNum > 0){
                // process every num below thousand
                int currNum = nextNum % 1000;
                int noOfDigitsCurrNum = String.valueOf(currNum).length();

                if(noofThousends == 1){
                    words.append(intToWords.get(String.valueOf(1000))).append(" and ");
                }

                if(noofThousends == 2){
                    words.append(intToWords.get(String.valueOf(1000 * 1000))).append(" and ");
                }

                if(noofThousends == 3){
                    words.append(intToWords.get(String.valueOf(1000 * 1000 * 1000))).append(" and ");
                }

                if(noofThousends == 4){
                    words.append(intToWords.get(String.valueOf(1000  * 1000 * 1000 * 1000))).append(" and ");
                }

                if(noOfDigitsCurrNum == 1){
                    words.append(intToWords.get(String.valueOf(num)));
                }

                if(noOfDigitsCurrNum == 2){
                    words.append(convert2Digits(num));
                }

                if(noOfDigitsCurrNum == 3){
                    words.append(convert3Digits(num));
                }

                nextNum = nextNum / 1000;
                noofThousends++;
            }

        }
        return words.toString();
    }

    String convert2Digits (int num){
        if(num < 20){
            return intToWords.get(String.valueOf(num));
        }
        int ones = num % 10;
        int tens = num - ones;
        return intToWords.get(String.valueOf(tens)) + " " + intToWords.get(String.valueOf(ones));
    }

    String convert3Digits (int num){
        int hundred = num / 100;
        int tens = num % 100;
        return intToWords.get(String.valueOf(hundred)) + " " + intToWords.get(String.valueOf(100)) + convert2Digits(tens);
    }
    
    public static void main(String[] args){
        intToWords.put(String.valueOf(0),"Zero");
        intToWords.put(String.valueOf(1),"One");
        intToWords.put(String.valueOf(2),"Two");
        intToWords.put(String.valueOf(3),"Three");
        intToWords.put(String.valueOf(4),"Four");
        intToWords.put(String.valueOf(5),"Five");
        intToWords.put(String.valueOf(6),"Six");
        intToWords.put(String.valueOf(7),"Seven");
        intToWords.put(String.valueOf(8),"Eight");
        intToWords.put(String.valueOf(9),"Nine");
        intToWords.put(String.valueOf(10),"Ten");
        intToWords.put(String.valueOf(11),"Eleven");
        intToWords.put(String.valueOf(12),"Twelve");
        intToWords.put(String.valueOf(13),"Thirteen");
        intToWords.put(String.valueOf(14),"Fourteen");
        intToWords.put(String.valueOf(15),"Fifteen");
        intToWords.put(String.valueOf(16),"Sixteen");
        intToWords.put(String.valueOf(17),"Seventeen");
        intToWords.put(String.valueOf(18),"Eighteen");
        intToWords.put(String.valueOf(19),"Nineteen");
        intToWords.put(String.valueOf(20),"Twenty");
        intToWords.put(String.valueOf(30),"Thirty");
        intToWords.put(String.valueOf(40),"Forty");
        intToWords.put(String.valueOf(50),"Fifty");
        intToWords.put(String.valueOf(60),"Sixty");
        intToWords.put(String.valueOf(70),"Seventy");
        intToWords.put(String.valueOf(80),"Eighty");
        intToWords.put(String.valueOf(90),"Ninety");
        intToWords.put(String.valueOf(100),"Hundred");
        intToWords.put(String.valueOf(1000),"Thousand");
        intToWords.put(String.valueOf(1000000),"Million");
        intToWords.put(String.valueOf(1000000000),"Billion");
        intToWords.put("1000000000000","Trillion");

        IntegerToEnglishWords intToWords = new IntegerToEnglishWords();

        System.out.println("For 1: "+intToWords.numberToWords(1));
        System.out.println("For 11: "+intToWords.numberToWords(11));
        System.out.println("For 111: "+intToWords.numberToWords(111));
        System.out.println("For 1111: "+intToWords.numberToWords(1111));

    }*/
