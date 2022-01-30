public class Main {
    public static void main(String[] args) {
        int intArray[] = {1,2,3};

        int cloneArray[] = intArray.clone();

        // will print false as deep copy is created
        // for one-dimensional array
        System.out.println(intArray == cloneArray); //wydrukuje false

        for (int i = 0; i < cloneArray.length; i++) {
            System.out.print(cloneArray[i]+" "); // wydrukuje: 1 2 3
        }

        System.out.println(intArray[1] == cloneArray[1]); // wydrukuje: true
    }
}