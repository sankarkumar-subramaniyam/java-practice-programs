package neetcode.top;

public class BinarySearch {

    public static int searchObjects(String find, String[] objs) {

        int i = 0;
        int j = objs.length - 1;

        while ((j > 0) && (i < objs.length - 1)) {
            int mid = (i + j) / 2;
            String obj = objs[mid];

            if (null != obj && find.equals(obj)) {
                return mid;
            } else {
                int res = find.compareTo(obj);
                if (res < 0) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            }
        }

        return -1;
    }

    public static int searchIntegerArray(int find, int[] ints) {

        int i = 0;
        int j = ints.length - 1;

        while ((j > 0) && (i < ints.length - 1)) {
            int mid = (i + j) / 2;
            int midInt = ints[mid];

            if (midInt == find) {
                return mid;
            } else if (midInt < find) {
                i = mid + 1;
            } else if (midInt > find) {
                j = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 35, 58, 66, 77, 99};
        String[] strings = new String[]{"A", "B", "C", "D", "E", "F", "G", "H"};

        System.out.println("position of 5? :" + searchIntegerArray(5, ints));
        System.out.println("position of 8? :" + searchIntegerArray(8, ints));
        System.out.println("position of 58? :" + searchIntegerArray(58, ints));
        System.out.println("postion of G? :" + searchObjects("G", strings));
        System.out.println("postion of B? :" + searchObjects("B", strings));
        System.out.println("postion of Z? :" + searchObjects("Z", strings));
    }
}
