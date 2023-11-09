//package org.example.models;
//
//import org.example.dao.PathsCollection;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Component;
//import javax.annotation.PostConstruct;
//
//import java.util.function.Function;
//
//@Component
//public class WelcomePrinter{
//    @PostConstruct
//    public void initialize() {
//        WelcomePrinter.Adder();
//    }
//    public static Function<Void, String> Printer(){
//        String str = "Welcome";
//        Function<Void, String> func = unused -> str;
//        return func;
//    }
//
//    private static void Adder()
//    {
//        PathsCollection.addPath("/welcome", WelcomePrinter.Printer());
//    }
//
//}
