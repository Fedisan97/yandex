class Printer {
    public static void print(int[] array, String separator) {
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(separator);
            }
            System.out.print(array[i]);
        }
        System.out.println(); 
    }
    public static void print(String[] array, String separator) {
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(separator);
            }
            System.out.print(array[i]);
        }
        System.out.println(); 
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        String[] words = {"Hello", "World"};

        print(numbers, ", ");
        print(words, "-");
    }
}
   
