
public class Main {

    public static int modArray(int[] array, int moduloValue){
        int result = 0 ;
        for (int iterator = 0 ; iterator < array.length ; iterator++){
            result += (int) (array[iterator]*(Math.pow(10,array.length - iterator -1))%moduloValue) % moduloValue ;
        }
        return result % moduloValue;
    }

    public static void main(String[] args) {
        System.out.println(modArray(new int[]{4, 3, 5, 3, 5, 3, 2, 1}, 47));
    }
}