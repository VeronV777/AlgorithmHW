public class OddIndices {
    //Написать алгоритм OddIndices, который принимает массив чисел,
    // и возвращает массив значений нечетных индексов
    public int [] OddIndicesAlgorithm (int [] array){
        if(array.length>0) {
            //   int odd = 0;
            //  for (int i = 0; i < array.length; i++) {
            //     if (i % 2 != 0) {
            //         odd++;
            //      }


            int[] array1 = new int[array.length / 2];
            int j = 0;
            for (int i = 1; i < array.length; i+=2) {
                //if (i % 2 != 0) {
                    array1[j] = array[i];
                    j++;
                }

         //   }
            return array1;
        }

        return new int []{};
}}
