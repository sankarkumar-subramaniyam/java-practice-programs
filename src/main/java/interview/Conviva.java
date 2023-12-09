package interview;

import java.util.HashSet;

public class Conviva {

    // char[] search; unique; alpha numeric
    // Ex: Array1 = [a, b, c]
    // char[] random seq big
    // Ex: Array2 = [a c c f d b d a e c]
    // find length of smallest wind with all chars

    /*
    --- during interview -----

    int findWindow(char[] search,char[] random){
        boolean isAllFound = false;
        int startWindowSize = search.length-1;

        while(startWindowSize < random.length) {
            HashSet<Character> windowSet = new HashSet<>();

            for(int i = Math.min(0,start); i < startWindowSize; i++){
                windowSet.add(random[i]);
            }

            for (int i = 0; i < startWindowSize;i++) {
               if(!windowSet.contains(search[i])) {
                   isAllFound = false;
                   break;
               }
                isAllFound = true;
            }
            startWindowSize++;
        }

        if(isAllFound)
            return startWindowSize+1;
        else
            return -1;
    }

    */

    public static void main(String[] args) {
        Conviva conviva = new Conviva();
        int windowSize = conviva.findWindow(new char[]{'a', 'b', 'c'}, new char[]{'a', 'c', 'c', 'f', 'd', 'b', 'd', 'a', 'e', 'c'});
        System.out.println(windowSize);
    }

    int findWindow(char[] search, char[] random) {
        int windowSize = search.length - 1;
        boolean isAllExists = false;

        while (windowSize < random.length) {
            int start = 0;
            int end = windowSize;

            while (end < random.length) {
                isAllExists = isAllExists(search, random, start, end);
                if (isAllExists) {
                    System.out.println("inside windowSize :" + windowSize);
                    break;
                }

                start++;
                end++;
            }
            if (isAllExists) {
                System.out.println("outside windowSize :" + windowSize);
                break;
            }
            System.out.println("outer windowSize :" + windowSize);
            windowSize++;
        }

        if (!isAllExists)
            windowSize = -1;

        return windowSize - 1;
    }

    boolean isAllExists(char[] search, char[] random, int start, int end) {
        boolean isAllExists = false;
        HashSet<Character> randomSubSet = new HashSet<>();
        for (int i = start; i < end; i++) {
            randomSubSet.add(random[i]);
        }
        int totalChars = search.length;
        for (int i = 0; i < search.length; i++) {
            if (randomSubSet.contains(search[i])) {
                totalChars--;
            }
        }

        if (0 == totalChars) {
            isAllExists = true;
            System.out.println("randomSubSet: " + randomSubSet);
        }

        return isAllExists;
    }
}
