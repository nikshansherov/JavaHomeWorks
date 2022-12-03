package HomeWork3;

import java.util.Random;

public class task01 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[20];
        System.out.print("Первоначальный массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(20);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int[] arr = mergeSort(array, 0, array.length-1);
        System.out.print("Сортированный массив: ");
        for (int i = 0; i < array.length; i++) System.out.print(arr[i] + " ");
    }
    // делит массив на кучу массивов по 1 элементу, передает их в merge
    public static int[] mergeSort(int[] array, int left, int right) {  
        if (right <= left) return array;
        int mid = (left+right)/2;
        mergeSort(array, left, mid);
        mergeSort(array, mid+1, right);
        merge(array, left, mid, right);
        return array;
    }
    // сортирует массивы и записывает в массив
    static void merge(int[] array, int left, int mid, int right) {
        // вычисляем длину
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;
    
        // создаем временные подмассивы
        int leftArray[] = new int [lengthLeft];
        int rightArray[] = new int [lengthRight];
    
        // копируем отсортированные массивы во временные
        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = array[left+i];
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = array[mid+i+1];
    
        // итераторы содержат текущий индекс временного подмассива
        int leftIndex = 0;
        int rightIndex = 0;
    
        // копируем из leftArray и rightArray обратно в массив  
        for (int i = left; i < right + 1; i++) {
            // если остаются нескопированные элементы в R и L, копируем минимальный
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                }
                else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            // если все элементы были скопированы из rightArray, скопировать остальные из leftArray
            else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }
            // если все элементы были скопированы из leftArray, скопировать остальные из rightArray
            else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }
}
