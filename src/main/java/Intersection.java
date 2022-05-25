import java.lang.reflect.Array;
import java.util.Arrays;

//Написать алгоритм Intersection,
// который принимает на вход 2 массива целых чисел и возвращает массив общих элементов.
public class Intersection {
    public int [] IntersectionAlgorithm (int[] intersect1, int [] intersect2){
if (intersect1.length<=0 || intersect2.length<=0){
    return new int[]{};
}
for (int i = 0; i< intersect1.length; i++){
for (int j = i+1; j< intersect1.length; j++){
if(intersect1[i]==intersect1[j]){
    intersect1[j]= -2147483648;
}
}
}
        for (int i = 0; i< intersect2.length; i++){
            for (int j = i+1; j< intersect2.length; j++){
                if(intersect2[i]==intersect2[j]){
                    intersect2[j]= -2147483648;
                }}}
        int count = 0;
        for (int i = 0; i<intersect1.length; i++){
        for (int j = 0; j<intersect2.length; j++){
       if (intersect2[j]==intersect1[i]&& intersect1[i] !=-2147483648 && intersect2[j] !=-2147483648){
       count++;
       break;
       }
        }
    }
        if (count==0){
        return new int[]{};
    } else{
        int [] result = new int [count];
        count =0;
            for (int i = 0; i<intersect1.length; i++){
                for (int j = 0; j<intersect2.length; j++){
                    if (intersect2[j]==intersect1[i]&& intersect1[i] !=-2147483648 && intersect2[j] !=-2147483648) {
                        result[count] = intersect1[i];
                        count++;
                        break;
                    } }
                }return result;
        }}}
