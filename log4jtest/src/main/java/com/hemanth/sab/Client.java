package com.hemanth.sab;
import org.apache.log4j.*;
public class Client
{
    //static Logger l=Logger.getLogger(Client.class.getName());
   static Logger l=Logger.getLogger("What message??");
    public static void main(String args[])
    {
        /*Layout l2=new SimpleLayout();
        Layout l1=new PatternLayout();
        //Appender a;
      //  Appender c=new ConsoleAppender(l1);
        try{
            Appender a=new FileAppender(l1,"my.text",true);
            Appender b=new FileAppender(l2,"hello.text",true);
            l.addAppender(a);
            l.addAppender(b);
        //   l.addAppender(c);
        }catch(Exception e){}
        l.fatal("This is error message");
        System.out.println("Executed Succesfully");*/
        l.fatal(" is fatal error");
        l.debug(" is debug error");
        l.info(" is info error");
        l.warn(" is fatal error");
        l.error(" is fatal error");
    }
}