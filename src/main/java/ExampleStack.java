public class ExampleStack {
    public static void main(String[] args) {

        //LIFO - last input first output
        methodOne();
    }

    public static void methodOne(){
        methodTwo();
    }

    public static void methodTwo(){

    }
}


/* Memory in Steck

    | two |
    | one |
    | main |
 */