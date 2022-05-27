package com.zabit;
/*
import java.math.BigDecimal;
import java.util.Date;
import java.util.Locale;

//import static java.math.BigDecimal.multiply;

public class Main {
public static void main(String[] args){

// This is a comment. This code or anything within the slashes won't run.
    // this is a way you can help keep track of things or notes to take
        /*multi line comment where you
        can keep on writing until you
        add another star and slash.
        */

           /* varibles are basically a symbol
           where you can give something a name
           or a place to store
           your stuff. you can call the
           varible by the name you give it
           and axcess the stuff in it.
             you can only store 1 and only value in varibles
             the varible cannot be a number*/
    // example of varible
        /* for varibles you need to first
        decide on a data type
        1. primitive data type
        2. refrence type
        int  < this is a primitive data type
        and can only be used for whole numbers
         */
    /* example*/
    //int number = 5;
        /* the "number" is the varible and 5 is the value
        you're putting in.
         */
       /* for character or letters/words
       you would need to have to use
       another data type.
       String   < is the data type for words
        */
    //example
   /* String n = "zabit";
    /* the n would be the varible
    and zabit would be the value
    for Strings you would have to put
    Quotation marks around the value.
     */
    /* System.out.print()  < is command to use to see
    if your code runned or not or if its right.
    for example i said "n" is equal to zabit with strings then
    i would use the "SOUT" command to see if it ran or to see
    whats inside "n".
    if you said ln next to print
    that means print it out on the next line and not all
    smushed up in one line.
     Example .. here im calling the varible N because
     there is a value in it and N is the only varible that
     should print out because i only printed the varible N.
     If I wanted to print out another varible then I would use
     the SOUT command again and call that varible*/
    /*System.out.println(n);
    /* Primitive data type is where you store
    single words and simple numbers
 ex: int-whole numbers, string-words, double-numbers +decimals, long.
    Reference data type is complex data like
    to find out the date or time.
     */
    // Example for referance data type
  /*  Date date = new Date();
    /* anytime you see the word
    "new" its a Referance data type or its complex
    when you used this you might see an import statement at the very
    top. we will talk about that later.
     the "date" or word in grey is the varible your giving.
     again you can use the SOUT command and
     call the varible to see the date
     */
   /* System.out.println(date);

    //primitive data type
 /* 1. byte
example: you cannot give the
varible the same word as "byte"
byte stores whole numbers from -128-127
  */
    /*byte thebyte = 126;

/* 2.short
 Short holds whole numbers from-32000-32000
  */
    /* short theshort = 32000;
    /* 3. int
    holds whole numbers from -2mil-2mil
     */
   /* int numbers = 2000000;
    /* 4. long
stores whole numbers from -9trillion-9trillion
     */
   /* long bignumbers = 900000000;
    /* 5. double
    stores fractional number as well as 15 decimal degits.
     */
   /* double fraction = 3 / 8;
    double decimal = 9.888888;
    /* 6. boolean
    store either true or false values
     */
   /* boolean fa = false;
    /* 7.char
    stores single characters/ letters.
     have to use single quotes for this
     */
   /* char characters = 'F';/*


    /* REFRENCE TYPE DATA
    with refrence type you have many options or value if
    you put name(varible) then a dot like name. , you can do it on the
    Sout command.
    here you can do many things with the variable name
    where as in premitive data you cannot do that.
    you can make the name zabit uppercase or change colors
    or lower case etc.
     */
    // 1. String
   /* String name = new String("zabit");
    System.out.println(name.toUpperCase(Locale.ROOT));

/*  the symbol % is called Modulus.
finds the ramainder for example 10 % 2 would be 0 because
        2 goes into 10, 5 times with 0 ramainder but if you put
        a 3 like 10 % 3 it would give you 1 because 3 * 3 is 9
        and you get 1 remainder.
 */
    // This uses PEMDAS, it does it for you.
    /*System.out.println(10 + 7 * 2);
/* there's a class that actually is for numbers and the
  the class is called Math. side note **
  if there is a dot/  that would mean its a Method.
  it basically shows you more things or certain things you can
  do.
 */
   /* System.out.println(Math.abs(-10)); /* this shows
        you the absolute value of -10. that would be 10 */
   /* System.out.println(Math.max(5, 10));/* this shows you
        the max number between 5 and 10. it would be 10. */
    /* System.out.println(Math.pow(5, 2)); /*this basically does
        5^2 / 5*5 = 25.

        Comparison Operators
       it compares two value */
    /* int myage = 14;
    int yourage = 12;
    boolean age = myage < yourage;
      /* boolean is a either true of false statement. it
        returns a true or false statement.*/
    /* System.out.println(age);
    //this will return false since 12 < 14.
      /* you can either do that or just
      System.out.println(myage < yourage); and delete the
      boolean line. you can also do == which is equals to
      or != which is not equal to. you can also do
      >= which is greater than or equal to and <= is less than
      or equal to.
      */
    //logical operators
/*just know that || means or and && means and. it mostly
talks about bolleans and if it either returns true
or false statements.
 */
//If statements
    /*So if statements allows you to execute curtain
    sections of you're code depending on the
    result of you're bollean expressions.
     */
    //Examples in c class.

    //else if statements
         /*basically is a second option to happen
         or is a second choice for the if statement.

          */
    // else statements
        /* basically would execute if none of the
        conditions above are met.
        Examples in "c" class.
        the code would stop executing when the code is true and
        the statement after that won't run.
         */

    //Ternary Operator
        /* If you only have a If and a else statment thAN you can
        make it a lot similar but doing
        String message = age>=18 ?
         "Iam an adult" : "iam not an adult";
          System.out.println(message)
          **See more in the C class.
          The message before the colon is a
          is statement and after would be an
          else statement.
          you can only use this when your evaluating
          one boolean value.
         */

            //Methods
     /* Example:
     lets say you wanted to multiply these numbers
     and wanted to keep on going.
     it would be too much work. this is where methods come in.

      */
//         int a = 5;
//         int b = 10;
//         System.out.println(a * b);
//
//    int c = 5;
//    int d = 10;
//    System.out.println(c * d);

      //To create you're method we type ...
      //public static void
              // then we name it/ lets call it multiply
        //public static void multiply() {
          /* to pass value in your method, you
          would type it in your parenthesis.
           */
    //public static void multiply(int a, int b) {
   // now we want to multiply for example.
        //System.out.println(a * b);
    /* now we can replace the int line for somthing else.
   We replace them for. We just say.
   See the whole thing in the methods class.
     */



















