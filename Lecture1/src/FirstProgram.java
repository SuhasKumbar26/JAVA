public class FirstProgram {
    public static void main(String[] args){
        System.out.print("Welcome to Java World\n");

        System.out.println("--------------------");
        System.out.print("One");
        System.out.print("Two"); //output: OneTwoThree
        System.out.print("Three\n");

        System.out.println("---------------------");
        System.out.println("One");  //output(ln): One
        System.out.println("Two");  //            Two
        System.out.println("Three");//            Three

        System.out.println("---------------------");
        System.out.println("Escape Sequence");
        System.out.println(" 'Hello Java' "); //output: 'Hello Java'
        System.out.println(" \"Hello Java\" ");//output: "Hello Java"
        System.out.println(" Hello\n Java ");//output: Hello nextLine:Java
        System.out.println(" Hello\tJava ");//output: Hello     Java
        System.out.println(" Hello\bJava ");//output: HellJava
    }
}

/*

 Java Developer Kit (JDK):
    software development kit used to develop App
    It includes JRE JVM

 Java Runtime Environment (JRE):
    Provides libraries JVM and other packages to run an Application
    it doesn't contain developing tools like JDk

 Java Virtual Machine (JVM):
    Responsible for executing Byte code into instructions.
    Ensures java Write once run anywhere Capabilities.

*/
