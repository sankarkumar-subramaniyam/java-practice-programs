package meta.prep;/*
 * Click `Run` to execute the snippet below!
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

/*
 * To execute Java, please define "static void main" on a class
 * named meta.prep.Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {

    int[] sum;

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Hello, World!");
        strings.add("Welcome to CoderPad.");
//        strings.add("This pad is running Java " + Runtime.version().feature());

        for (String string : strings) {
            System.out.println(string);
        }

        Solution sol = new Solution();
        LinkedList<Character> stack = new LinkedList<>();

        // Arrys
//        sol.createAndManipulateArrays();

        // System.out.println("Expected: Cheud-726 ; Actual: " + sol.rotationalCipher("Zebra-493",3));

        // "stuvRPQrpq-999.@"]
        // System.out.println("Expected: nopqrstuvwxyzABCDEFGHIJKLM9012345678 ; Actual: " + sol.rotationalCipherSankar("abcdefghijklmNOPQRSTUVWXYZ0123456789",39));

        //  System.out.println("abcd Expected: 4 ; Actual: "+ sol.matchingPairs("abcd","adcb"));
//        System.out.println("mno Expected: 1 ; Actual: "+ sol.matchingPairs("mno","mno"));

//        System.out.println("dcbefebce Expected: 5 ; Actual: "+ sol.minLengthSubstring("dcbefebce","fd"));
//        System.out.println("mno Expected: -1 ; Actual: "+ sol.minLengthSubstring("mno","ac"));
//        System.out.println("bfbeadbcbcbfeaaeefcddcccbbbfaaafdbebedddf Expected: -1 ; Actual: "+ sol.minLengthSubstring("bfbeadbcbcbfeaaeefcddcccbbbfaaafdbebedddf","cbccfafebccdccebdd"));

       /*
        int k_1 = 6;
        int[] arr_1 = {1, 2, 3, 4, 3};
        int expected_1 = 2;
        int output_1 = sol.numberOfWays(arr_1, k_1);
        System.out.println(" Expected:"+ expected_1 +" ; Actual: "+output_1);

        int k_2 = 6;
        int[] arr_2 = {1, 5, 3, 3, 3};
        int expected_2 = 4;
        int output_2 = sol.numberOfWays(arr_2, k_2);
        System.out.println(" Expected:"+ expected_2 +" ; Actual: "+output_2);
        */

        /*int revenues_1[] = {100, 200, 300, 400, 500};
        int milestones_1[] = {300, 800, 1000, 1400};
        int expected_1[] = {2, 4, 4, 5};
        int[] output_1 = sol.getMilestoneDays(revenues_1, milestones_1);
        sol.printArray(output_1);*/


        /*int arr_1[] = {2, 1, 2, 5};
        boolean expected_1 = true;
        boolean output_1 = sol.balancedSplitExists(arr_1);
        System.out.println(" Expected:"+ expected_1 +" ; Actual: "+output_1);

        int arr_2[] = {3, 6, 3, 4, 4};
        boolean expected_2 = false;
        boolean output_2 = sol.balancedSplitExists(arr_2);
        System.out.println(" Expected:"+ expected_2 +" ; Actual: "+output_2);*/

       /* String s_1 = "abc";
        String expected_1 = "bac";
        String output_1 =  sol.findEncryptedWord(s_1);
        System.out.println(" Expected:"+ expected_1 +" ; Actual: "+output_1);

        String s_2 = "abcd";
        String expected_2 = "bacd";
        String output_2 = sol.findEncryptedWord(s_2);
        System.out.println(" Expected:"+ expected_2 +" ; Actual: "+output_2);*/

       /* int target_1 = 94;
        int arr_1[] = {5, 10, 25, 100, 200};
        boolean expected_1 = false;
        boolean output_1 = sol.canGetExactChange(target_1, arr_1);
        System.out.println(" Expected:"+ expected_1 +" ; Actual: "+output_1);

        int target_2 = 75;
        int arr_2[] = {4, 17, 29};
        boolean expected_2 = true;
        boolean output_2 = sol.canGetExactChange(target_2, arr_2);
        System.out.println(" Expected:"+ expected_2 +" ; Actual: "+output_2);*/

        String s_1 = "{[(])}";
        boolean expected_1 = false;
        boolean output_1 = sol.isBalanced(s_1);
        System.out.println(" Expected:" + expected_1 + " ; Actual: " + output_1);

        String s_2 = "{{[[(())]]}}";
        boolean expected_2 = true;
        boolean output_2 = sol.isBalanced(s_2);
        System.out.println(" Expected:" + expected_2 + " ; Actual: " + output_2);
    }

    private <T> void printArray(T[] inArray) {
        System.out.println();
        for (T element : inArray) {
            System.out.println(element);
        }
    }

    private void printArray(boolean[] inArray) {
        for (int i = 0; i < inArray.length; i++) {
            System.out.println(inArray[i]);
        }
    }

    private void printArray(int[] inArray) {
        for (int i = 0; i < inArray.length; i++) {
            System.out.println(inArray[i]);
        }
    }

    private <T> int getMidOfArray(T[] inArray) {
        return (int) Math.floor(inArray.length / 2);
    }

    private void sortArray(int[] nums) {
        // BubbleSort
        System.out.println("== Before bubblesort=== Array Length:" + nums.length);
        // printArray(nums);
        // bubbleSort(nums);
        System.out.println("== After bubblesort===");
        // printArray(nums);

        mergeSort(nums, 0, nums.length - 1);
        printArray(nums);
        // int[] expected = nums;
        // Arrays.sort(expected);
        // assertArrayEquals(expected, bubbleSort(nums));
    }

    private void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);
            merge(nums, left, mid, right);
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {

        //length of sub Arrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(arr, left + 0, L, 0, n1);

        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;
        while (i < n1 & j < n2) {
            if (L[i] < R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    private int[] bubbleSort(int[] nums) {
        // O(N^2)
        for (int last = nums.length - 1; last > 0; last--) { // O(N)
            for (int curr = 0; curr < last; curr++) { // O(N-j)
                int next = curr + 1;
                if (next <= last && (nums[curr] > nums[next])) {
                    int temp = nums[next];
                    nums[next] = nums[curr];
                    nums[curr] = temp;
                }
            }
        }
        return nums;
    }

    private void createAndManipulateArrays() {
        // Array
        int arraySize = 10;

        boolean[] enabled = new boolean[arraySize];
        printArray(enabled);
        int[] ranksInt = new int[arraySize];
        ranksInt[0] = 10;
        ranksInt[1] = 2;
        ranksInt[2] = 30;
        ranksInt[3] = 40;
        ranksInt[4] = 50;
        ranksInt[5] = 190;
        ranksInt[6] = 20;
        ranksInt[7] = 30;
        ranksInt[8] = 40;
        ranksInt[9] = 50;

        Integer[] ranks = new Integer[arraySize];
        ranks[0] = 10;
        ranks[1] = 20;
        ranks[2] = 30;
        ranks[3] = 40;
        ranks[4] = 50;

        String[] names = new String[]{"A", "B", "C", "D"};

        // itrative one pointer
        // printArray(ranksInt);
        // printArray(ranks);
        // printArray(names);

        // find mid of an Array
        int mid = getMidOfArray(ranks);
        // System.out.println("Mid of the array for ranks " + mid + "; length :" +
        // ranks.length);

        mid = getMidOfArray(names);
        // System.out.println("Mid of the array for names " + mid + "; length :" +
        // names.length);

        // SortArray
        sortArray(ranksInt);


        // areTheyEqual
        System.out.println("areTheyEqual ? " + areTheyEqual(new int[]{1, 2, 3, 4}, new int[]{1, 4, 3, 2}));
        System.out.println("areTheyEqual ? " + areTheyEqual(new int[]{1, 2, 3, 4}, new int[]{1, 4, 8, 2}));

        int[] arr = new int[]{4, 2, 3, 1, 5};
        System.out.println("findSignatureCounts ");
        printArray(findSignatureCounts(arr));
    }

    // Reverse to Make Equal
    boolean areTheyEqual(int[] array_a, int[] array_b) {
        boolean areTheyEqual = true;
        // Using HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        /*

        Access map objects:

        ArrayList<Integer> al = (ArrayList<Integer>) map.values();
        HashSet<Integer> set = (HashSet<Integer>)map.keySet();
        int i = map.get(0);
        map.getOrDefault(0,0);

        for(Integer value: map.values()){

        }

        for(Integer k: map.keySet()){

        }*/

        // count each element in the array
        for (int i : array_a) {
            map.put(i, (map.getOrDefault(i, 0)) + 1);
        }

        // Check for equal no.of elements in the array
        for (int i : array_b) {
            if (map.containsKey(i) && (map.get(i) > 0)) {
                map.put(i, map.get(i) - 1);
            } else {
                areTheyEqual = false;
            }
        }

        // Using Arrays Sort
        /*
        Arrays.sort(array_a);
        Arrays.sort(array_b);
        if (array_a.length != array_b.length) {
            areTheyEqual = false;
        }
        for (int i = 0; i < array_a.length; i++) {
            if (array_a[i] != array_b[i]) {
                areTheyEqual = false;
            }
        }
        */
        return areTheyEqual;
    }

    //Passing Yearbooks
    int[] findSignatureCounts(int[] arr) {
        // Write your code here
        int[] output = new int[arr.length];

        for (int student = 1; student <= arr.length; student++) {
            int bookOwner = student;
            int currentHolder = student;

            do {
                output[student - 1] += 1;
                currentHolder = arr[currentHolder - 1];
            } while (currentHolder != bookOwner);

        }
        return output;
    }

    //Contiguous Subarrays
    int[] countSubarrays(int[] arr) {
        // Write your code here

        // 1. initialize ourCountArray
        // 2. for each element go forward & backward till curr value is higher
        // increment the counter.

        int[] outCount = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            //init
            outCount[i] += 1;

            // forward loop
            int r = i + 1;
            while (r < arr.length && arr[i] > arr[r]) {
                outCount[i] += 1;
                r++;
            }

            // backward loop
            int l = i - 1;
            while (l >= 0 && arr[i] > arr[l]) {
                outCount[i] += 1;
                l--;
            }
        }

        return outCount;
    }

    //Rotational Cipher
    String rotationalCipher(String input, int rotationFactor) {
        // Write your code here
        int ordA = 'A';
        int orda = 'a';
        StringBuilder output = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                output.append((Character.getNumericValue(ch) + rotationFactor) % 10);
            } else if (Character.isAlphabetic(ch)) {
                if (Character.isUpperCase(ch)) {
                    int temp = (ch - ordA + rotationFactor) % 26;
                    output.append((char) (ordA + temp));
                } else {
                    int temp = (ch - orda + rotationFactor) % 26;
                    output.append((char) (orda + temp));
                }
            } else {
                output.append(ch);
            }
        }
        return output.toString();
    }

    String rotationalCipherSankar(String input, int rotationFactor) {
        // Write your code here
        //ASCII ?

        int numericMinASCII = '0';
        int numericMaxASCII = numericMinASCII + 9;

        int charMinASCII_upper = 'A';
        int charMaxASCII_upper = charMinASCII_upper + 25;

        int charMinASCII_lower = 'a';
        int charMaxASCII_lower = charMinASCII_lower + 25;


        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int currChar = chars[i];

            if (Character.isAlphabetic(currChar)) {
                int currCharWithRotation = currChar + (rotationFactor % 26);
                //Upper case
                if (Character.isUpperCase(currChar)) {
                    if (currCharWithRotation >= charMinASCII_upper
                            && currCharWithRotation <= charMaxASCII_upper) {
                        chars[i] = (char) currCharWithRotation;
                    } else {
                        int validValue = charMinASCII_upper + (currCharWithRotation - charMaxASCII_upper) - 1;
                        chars[i] = (char) validValue;
                    }
                }
                // Lowercase
                if (Character.isLowerCase(currChar)) {
                    if (currCharWithRotation >= charMinASCII_lower
                            && currCharWithRotation <= charMaxASCII_lower) {
                        chars[i] = (char) currCharWithRotation;
                    } else {
                        int validvalue = charMinASCII_lower + (currCharWithRotation - charMaxASCII_lower) - 1;
                        chars[i] = (char) validvalue;
                    }
                }
            }

            // numerical
            if (Character.isDigit(currChar)) {
                int currCharWithRotation = currChar + (rotationFactor % 10);
                if (currCharWithRotation >= numericMinASCII
                        && currCharWithRotation <= numericMaxASCII) {
                    chars[i] = (char) currCharWithRotation;
                } else {
                    int validvalue = numericMinASCII + (currCharWithRotation - numericMaxASCII) - 1;
                    chars[i] = (char) validvalue;
                }
            }
        }
        return new String(chars);
    }

    int matchingPairs(String s, String t) {
        // Write your code here

        // var to hold max matching
        // swap indexes in S
        // Count matching indexes
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        int maxMatchingChars = 0;
        for (int i = 0; i < chars1.length - 1; i++) {
            for (int j = 0; j < chars1.length - 1; j++) {
                if (i != j) {
                    char[] tempChars = chars1; // Arrays.copyOf(chars1,chars1.length);

                    char temp = tempChars[i];
                    tempChars[i] = tempChars[j];
                    tempChars[j] = temp;

                    maxMatchingChars = Math.max(maxMatchingChars, countMatchingChars(tempChars, chars2));
                }
            }
        }

        return maxMatchingChars;
    }

    int countMatchingChars(char[] chars1, char[] chars2) {
        int matchingChars = 0;
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] == chars2[i]) {
                matchingChars++;
            }
        }
        return matchingChars;
    }

    int minLengthSubstring(String s, String t) {
        // Write your code here

        // if t.length > s.length ? yes return -1
        // is all chars in t present in s ? no return -1
        // S - substring window length >= t.length
        // if (window length = t.length ) && str == substr ? yes retrun str.length
        //  else
        // incr window length & loop
        // subString.contains() yes ? Math.min(minSubStrL , subString.length)

        if (t.length() > s.length())
            return -1;

        int minLengthSubstring = -1;
        int windowSize = t.length();
        char[] charsInT = t.toCharArray();

        HashMap<Character, Integer> charsInSubStrT = new HashMap<>();
        for (int i = 0; i < charsInT.length; i++) {
            charsInSubStrT.put(charsInT[i], charsInSubStrT.getOrDefault(charsInT[i], 0));
        }

        while (windowSize <= s.length()) {
            if (isAllCharsPresent(s.substring(0, windowSize), t)) {
                return windowSize;
            } else {
                HashMap<Character, Integer> charsInSubStr = new HashMap<>();
                for (int i = 0; i < windowSize; i++) {
                    charsInSubStr.put(s.charAt(i), charsInSubStr.getOrDefault(s.charAt(i), 0));
                }

                if (isAllCharsPresent(charsInSubStr, charsInSubStrT)) {
                    return windowSize;
                }
            }
            windowSize++;
        }

        return minLengthSubstring;

    }

    boolean isAllCharsPresent(String charsInSubStr, String t) {
        return charsInSubStr.contains(t);
    }

    boolean isAllCharsPresent(HashMap<Character, Integer> charsInSubStr, HashMap<Character, Integer> charsInT) {
        boolean isAllCharsPresent = true;
        for (Character key : charsInT.keySet()) {
            if (!charsInSubStr.containsKey(key)) {
                isAllCharsPresent = false;
            } else {
                if (charsInSubStr.get(key) != charsInT.get(key)) {
                    isAllCharsPresent = false;
                }
            }
        }
        return isAllCharsPresent;
    }

    int numberOfWays(int[] arr, int k) {
        // Write your code here

        int n = arr.length;
        int pairCount = 0;

        //n^2
        //for(int i =0; i< n;i++){
        //  for(int j = 0; j < n;j++){
        //    if(i!=j && (arr[i]+arr[j] == k)){
        //      pairCount++;
        //    }
        //  }
        //}

        // O(N)
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(k - arr[i])) {
                pairCount += map.get(k - arr[i]);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

    /*for(Map.Entry<Integer, Integer> set: map.entrySet()){
      int numberToAdd = k - set.getKey();
      if(map.containsKey(numberToAdd)){
        pairCount = pairCount + set.getValue();
        map.put(set.getKey(),0);
      }
    }*/

        return pairCount;
    }

    int[] getMilestoneDays(int[] revenues, int[] milestones) {
        // Write your code here

        // O(r*m)
    /*
    int[] output = new int[milestones.length];
    for(int i=0;i<milestones.length;i++){
      int milestone = 0;
      for(int j=0;j<revenues.length;j++){
        milestone = milestone+revenues[j];
        if(milestone >= milestones[i]){
          output[i] = j+1;
          break;
        }
      }
    }
    */

        // Cumulative sums
        // Write Binary search
        // Loop milestone and search for indexes of milestone
        int[] output = new int[milestones.length];

        sum = new int[revenues.length];
        sum[0] = revenues[0];
        for (int i = 1; i < revenues.length; i++) {
            sum[i] = sum[i - 1] + revenues[i];
        }

        for (int i = 0; i < milestones.length; i++) {
            int index = binarySearch(milestones[i]);
            output[i] = index + 1;
        }

        return output;
    }

    private int binarySearch(int target) {
        int left = 0;
        int right = sum.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (sum[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return (left < sum.length ? left : -1);
    }

    boolean balancedSplitExists(int[] arr) {
        // Write your code here

        // Sort arr
        // two windows f_window & r_window
        // split the arr in middle find sum of each
        // sum of the windows are equal
        // return true

        boolean isBalancedSplitExists = false;

        Arrays.sort(arr);

        int mid = arr.length / 2;

        while (mid < arr.length) {
            if (sumOfArr(arr, 0, mid) == sumOfArr(arr, mid, arr.length)) {
                if (arr[mid - 1] < arr[mid]) {
                    isBalancedSplitExists = true;
                    break;
                }
            }
            mid++;
        }

        return isBalancedSplitExists;
    }

    int sumOfArr(int[] arr, int start, int end) {
        int sumOfArr = 0;

        for (int i = start; i < end; i++) {
            sumOfArr += arr[i];
        }

        return sumOfArr;
    }

    String findEncryptedWord(String s) {
        // Write your code here
        return encrypt(s);
    }

    String encrypt(String str) {
        if (null == str)
            return "";
        if (str.trim().equals(""))
            return "";

        int n = str.length();
        int mid = (n % 2 == 0) ? ((n - 1) / 2) : (n / 2);

        String middleStr = String.valueOf(str.charAt(mid));
        if (n > 1) {
            String leftStr = String.valueOf(encrypt(str.substring(0, mid)));
            String rightStr = String.valueOf(encrypt(str.substring(mid + 1, n)));
            return middleStr + leftStr + rightStr;
        }

        return middleStr;
    }

    /*boolean canGetExactChange(int targetMoney, int[] denominations) {
        // Write your code here

        // check any value in denominations is smaller than target
        // if no, return false

        // find out min array of denomination which we can use to combute target
        // method to recurse on target amount for given array

        boolean canGetExactChange =false;

        if(targetMoney == computeTarget(targetMoney,denominations,denominations.length-1)){
            canGetExactChange = true;
        }

        return canGetExactChange;
    }

    int computeTarget(int targetMoney, int[] denominations, int lastIndex){
        if(0 == lastIndex){
            System.out.println(denominations[lastIndex]);
            if(targetMoney == denominations[lastIndex])
                return denominations[lastIndex];
            else
                return 0;
        } else {
            for (int i = 1; i <= lastIndex; i++) {
                if (targetMoney < denominations[i]) {
                    lastIndex = i - 1;
                    break;
                }
            }
            System.out.println(denominations[lastIndex]);
            return denominations[lastIndex]
                    + computeTarget(targetMoney - denominations[lastIndex], denominations, lastIndex);
        }
    }
    */

    boolean canGetExactChange(int targetMoney, int[] denominations) {
        if (targetMoney < 0)
            return false;
        if (targetMoney == 0)
            return true;
        for (int i = 0; i < denominations.length; i++) {
            if (canGetExactChange(targetMoney - denominations[i], denominations)) {
                return true;
            }
        }
        return false;

    }

    boolean isBalanced(String s) {
        // Write your code here
        LinkedList<Character> stack = new LinkedList<>();

        // Iterate
//        for(Character c : stack){
//
//        }

        // get at
//        stack.get(2);

        char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {

            char cIn = chars[i];

            if (')' == cIn || '}' == cIn || ']' == cIn) {
                stack.push(cIn);
            }

            if ('(' == cIn || '{' == cIn || '[' == cIn) {
                char c = stack.poll();
                if ('(' == cIn && ')' != c) {
                    return false;
                }
                if ('{' == cIn && '}' != c) {
                    return false;
                }
                if ('[' == cIn && ']' != c) {
                    return false;
                }
            }
        }

        return (stack.size() == 0);

    }

}
