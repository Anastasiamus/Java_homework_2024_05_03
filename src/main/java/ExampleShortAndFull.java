public class ExampleShortAndFull {
    public static void main(String[] args) {

        //&& -short
        //& - full

        if (one() && two()) {
            System.out.println("Its ok");
        }


    }
    public static boolean one(){
        System.out.println("One");
        return false;
    }


    public static boolean two(){
        System.out.println("Two");
        return false;
    }
}
