public class LinearSearchinString {
    public static void main(String[] args) {


    String name = "deebanchakravarthy";
    char targetch = 'z';

    strlinearsearch(name , targetch);
    System.out.println(strlinearsearch(name, targetch));

    }

    static boolean strlinearsearch(String str , char targetch ) {
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(targetch==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
