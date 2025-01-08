public class MyClass {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i <= array.length; i++) { //Error: accessing beyond the array bounds
            array[i] = i * 2;
        }
        for (int value : array) {
            System.out.println(value); //Prints 0,2,4,6,8, exception at the end
        }
    }
}