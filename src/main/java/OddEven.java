public class OddEven {
    //task1 Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,
    // если число нечетное, и “Even”, если число четное.
    // Во всех остальных случаях результат будет “Undefined”.
    public String OddEvenAlgorithm (long number){
        String odd = "Odd";
        String even = "Even";
        String undefined = "Undefined";
        if (number >= -2147483648L && number <=2147483647L) {
        if (number%2==0){
            return even;
        } else {
           return odd;
        } }
            return  undefined;
    }}

