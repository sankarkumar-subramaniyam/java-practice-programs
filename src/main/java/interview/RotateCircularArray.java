package interview;

public class RotateCircularArray {

    //Implement below items

    // Rotate(int nTimes)
    // Reset()
    // get(int index)
    // set(int[] arr)


    private int[] arr = new int[0];
    private int startIndex = 0;

    public static void main(String[] args) {
//        Character.toLowerCase();
        String.valueOf(4);


        RotateCircularArray rotateCircularArray = new RotateCircularArray();
        int[] arr = new int[]{1, 2, 3, 4, 5};
        rotateCircularArray.set(arr);
        System.out.println("at index 2 ?: " + rotateCircularArray.get(0));
        rotateCircularArray.rotate(1);
        System.out.println("at index 2 ?: " + rotateCircularArray.get(0));
        rotateCircularArray.rotate(1);
        System.out.println("at index 2 ?: " + rotateCircularArray.get(0));
        rotateCircularArray.rotate(1);
        System.out.println("at index 2 ?: " + rotateCircularArray.get(0));
        rotateCircularArray.rotate(1);
        System.out.println("at index 2 ?: " + rotateCircularArray.get(0));
        rotateCircularArray.rotate(1);
        System.out.println("at index 2 ?: " + rotateCircularArray.get(0));
        rotateCircularArray.rotate(1);
        System.out.println("at index 2 ?: " + rotateCircularArray.get(0));
        rotateCircularArray.rotate(1);
        System.out.println("at index 2 ?: " + rotateCircularArray.get(0));
        rotateCircularArray.rotate(1);
        System.out.println("at index 2 ?: " + rotateCircularArray.get(0));
        rotateCircularArray.rotate(1);
        System.out.println("at index 2 ?: " + rotateCircularArray.get(0));
        rotateCircularArray.rotate(1);
        System.out.println("at index 2 ?: " + rotateCircularArray.get(0));
        rotateCircularArray.reset();
        System.out.println("at index 2 ?: " + rotateCircularArray.get(0));
        rotateCircularArray.rotate(10);
        System.out.println("at index 2 ?: " + rotateCircularArray.get(0));
        rotateCircularArray.rotate(10);
        System.out.println("at index 2 ?: " + rotateCircularArray.get(0));
    }

    int get(int index) {
        int newIndex = startIndex + index;

        if ((startIndex + index) > (arr.length - 1)) {
            newIndex = ((startIndex + index) % arr.length);
        }

        return arr[newIndex];
    }

    void set(int[] arr) {
        this.arr = arr;
    }

    void reset() {
        startIndex = 0;
    }

    void rotate(int nTimes) {
        if ((startIndex + nTimes) > (arr.length - 1)) {
            startIndex = ((startIndex + nTimes) % arr.length);
        } else {
            startIndex = (startIndex + nTimes);
        }
    }

}
