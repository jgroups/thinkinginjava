package me.lbing.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * Created by king on 16/5/11.
 */
public class ShowMethods {
    private static String usage = "usage:\n" +
            "ShowMethods qualified class name \n" +
            "To show all methods in class or:\n" +
            "ShowMethods qualified class name word\n" +
            "To search for methods involving 'word'";
    private static Pattern p = Pattern.compile("\\w+\\.");

    public static void main(String[] args) {
        args = new String[]{
                "me.lbing.reflect.ShowMethods"
        };
        if (args.length < 1) {
            System.out.println(usage);
            System.exit(0);   
        }
        int lines = 0;
        try {
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor<?>[] constructors = c.getConstructors();
            if (args.length == 1) {
                for (Method method :
                        methods) {
                    System.out.println(p.matcher(method.toString()).replaceAll(""));
                }
                System.out.println("----------------");
                for (Constructor ctor :
                        constructors) {
                    System.out.println(p.matcher(ctor.toString()).replaceAll(""));
                }
            } else {

            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


}
