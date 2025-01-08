public class MyClass {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) { //Corrected: loop condition changed
            array[i] = i * 2;
        }
        for (int value : array) {
            System.out.println(value); //Prints 0,2,4,6,8
        }
    }
}