for developing JAVA prgms we need JDK
JDK(development tools)+JRE(Java class lib + JVM)

First.java -> javac (compiler) -> First.class(byte code) ->java(jre)(jvm)(runtime) -> executed.

import java.lang.*;

PS C:\Users\siddu\OneDrive\Desktop\TechSkills\Java\Lang> type l0001HelloWorld.java
public class l0001HelloWorld{
    public static void main(String args[]){
        System.out.println("Hello, World!");
    }
}

PS C:\Users\siddu\OneDrive\Desktop\TechSkills\Java\Lang> javac l0001HelloWorld.java
PS C:\Users\siddu\OneDrive\Desktop\TechSkills\Java\Lang> java l0001HelloWorld     
Hello, World!

Enter the num1 : 
12.3
Exception in thread "main" java.util.InputMismatchException
        at java.base/java.util.Scanner.throwFor(Scanner.java:947)
        at java.base/java.util.Scanner.next(Scanner.java:1602)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2267)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2221)
        at l0004Scanner.main(l0004Scanner.java:9)


