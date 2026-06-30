public class Pz4 {
    public static void main(String[] args){
        int[] numbers = {10, 25, 7, 42, 18};
        System.out.println("Элементы массива:");
        for(int x = 0; x < numbers.length ; x++){
            System.out.println(numbers[x]);
        }
        int sum = 0;
        for(int x = 0; x < numbers.length; x++){
            sum = sum + numbers[x];
        }
        System.out.println("Сумма элементов:" + sum);

        int max = numbers[0];
        for(int x = 1; x < numbers.length; x++){
            if(numbers[x] > max ){
                max = numbers[x];
            }
        }
        System.out.println("Максимальное значение = " + max);

        boolean found = false;
        for(int x = 0; x < numbers.length; x++) {
            if(numbers[x] == 42){
                found = true;
            }
        }
        if(found) {
            System.out.println("Число 42 присутствует");
        } else {
            System.out.println("Числа 42 в массиве нет");

        
        }
    }

}