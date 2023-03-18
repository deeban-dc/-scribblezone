public class passingexample {
    public static void main(String[] args) {
        String name = "Deeban"; //declared and initialised
        greet(name); //this method greet calls with argument (name) passed in.
    }

    //now the naam parameter refers  to same object as (name) variable
//After the greet method is called, the value of name is not changed in the main method.
// Instead, a separate copy of the String object is passed to the greet method,
// and any changes made to the object inside the greet method will not affect the original object in the main method.
//In this case, the greet method simply prints the value of the naam parameter to the console,
// so no changes are made to the object. The output of the program will be the String "Deeban".

    static void greet(String naam) {
        System.out.println(naam);
    }
}
