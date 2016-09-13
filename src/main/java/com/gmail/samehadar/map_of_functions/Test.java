package com.gmail.samehadar.map_of_functions;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 13.09.2016.
 */
public class Test {

    public static void main(String[] args) throws Exception {
        Map<Character, Runnable> commands = new HashMap<>();

        // Populate commands map
        commands.put('h', () -> System.out.println("Help"));
        commands.put('t', () -> System.out.println("Teleport"));

        // Invoke some command
        char cmd = 't';
        commands.get(cmd).run();   // Prints "Teleport"
    }

}
