//package org.example.models;
//
//import org.example.dao.PathsCollection;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//import java.util.function.Function;
//
//@Component
//public class TestPrinter{
//    @PostConstruct
//    public void initialize() {
//        TestPrinter.Adder();
//    }
//
//    public static Function<Void, String> Printer(){
//        String str = "Test";
//        Function<Void, String> func = unused -> str;
//        return func;
//    }
//
//    private static void Adder()
//    {
//        PathsCollection.addPath("/test", TestPrinter.Printer());
//    }
//}
