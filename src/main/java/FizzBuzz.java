
/**
 * @ClassName FizzBuzz
 * @Description TODO
 * @Author yyy
 * @Date 2019/5/8 16:24
 * @Version 1.0
 * @see FizzBuzzTest
 **/
public class FizzBuzz {
    public static String of(int i) {
        if (i%3==0 && i% 5 ==0){
            return "FizzBuzz";
        }else if (i%3==0){
            return "Fizz";
        }else if(i%5==0){
            return "Buzz";
        }else{
            return String.valueOf(i);
        }
    }
}
