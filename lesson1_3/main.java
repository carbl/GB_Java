/*
Дан массив nums = [3,2,2,3] и число val = 3.
Если в массиве есть числа, равные заданному,
нужно перенести эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива
должны быть отличны от заданного, а остальные - равны ему.
 */
package lesson1_3;

public class main {
    public static void main(String[] args) {
        int[] num = new int[] {2,4,3,6,0,1,2,5,2,3,2,2,3};
        int val = 3;

        int count = 0;
        int index = num.length-1;
        int[] numOut = new int[num.length];

        for(int i = 0; i <= num.length-1; i++) {
            if(num[i] == val) {
                numOut[index] = num[i];
                index--;
            } else {
                numOut[count] = num[i];
                count++;
            }
        }

        for(int i : numOut) {
            System.out.print(i + " ");
        }
    }
}
