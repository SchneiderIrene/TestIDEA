package lesson_13;

public class Arrays {
    public static void main(String[] args) {
        int[] sample = new int[10];
        sample[0] = 45;
        sample[1] = 30;
        sample[2] = 34;
        sample[3] = 307;
        System.out.println("Zero elements of sample array is " + sample[0]);
        int [] numbers = new int[]{1,23,3,4,5,6,7};
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.print(arr[0] + " " +  arr[1]);
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println(arr.length);
        int len = arr.length;
        System.out.println(len);
        System.out.println("array nums printed in cycle");
        //  вывести массив nums  на печать  в цикле
        for (int i = 0; i < arr.length; i++){
            System.out.println("nums[" + i + "] = " + arr[i]);
        }

        //  создать массив из 10 элементов, заполнить его элементами от 0 до 9 и вывести на печать в цикле
        System.out.println("ints array:");
        //1. обьявляем массив из 10 элементов целого типа
        int[] ints = new int[10];

        // 2. присваиваем значения элементам массива
        for (int i = 0; i < ints.length; i++){
            ints[i] = i + 10;
        }
        // выводим значения элементов на печать
        for (int i = 0; i < ints.length; i++){
            System.out.println("ints[" + i + "] = " + ints[i]);
        }

        // ints[0] = "John"
        //                  0        1     2     3
        String[] names = {"John ","Mary","Ann","Bill"};


        //  String name = "Jack";
        //  String name1 = new String("Jack");

        for( int i = 0; i < names.length; i++){
            System.out.println("names[" + i + "] = " + names[i]);
        }

        names[1] = "Kate";
        System.out.println("with Kate");
        for( int i = 0; i < names.length; i++){
            System.out.println("names[" + i + "] = " + names[i]);
        }

        names[names.length -1] = "Tom"; // последний элемент
        names[names.length - 2] = "Peter";
        System.out.println("with Tom");
        for( int i = 0; i < names.length; i++){
            System.out.println("names[" + i + "] = " + names[i]);
        }

        String[] fruits = new String[5];
        fruits[0] = "Banana";


        for( int i = 0; i < fruits.length; i++){
            System.out.println("fruits[" + i + "] = " + fruits[i]);
        }
        // создаем новый массив длиной на два элемента больше чем старый
        String[] newNames = new String[names.length + 2];

        // копируем элементы из старого в новый
        for (int i = 0; i < names.length;i++){
            newNames[i] = names[i];
        }

        System.out.println("newNames");
        for( int i = 0; i < newNames.length; i++){
            System.out.println("newNames[" + i + "] = " + newNames[i]);
        }

        newNames[newNames.length -1 ] = "Ben";
        newNames[newNames.length -2 ] = "Harry";

        System.out.println("newNames");
        for( int i = 0; i < newNames.length; i++){
            System.out.println("newNames[" + i + "] = " + newNames[i]);
        }
        // найти и вывести на печать мин и макс эл-ты массива
        int[] array = {5,2,8,0,1,45};
        int max = array[0];

        for (int i = 1; i < array.length; i++){
            if(array[i] > max)
                max = array[i];
        }
        System.out.println(max);
        System.out.println(Integer.MAX_VALUE);
    }
    public static void abc (){}
}
