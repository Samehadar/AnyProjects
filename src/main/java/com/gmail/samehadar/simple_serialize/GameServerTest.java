package com.gmail.samehadar.simple_serialize;

import java.io.*;

/**
 * Test serialize methods
 */
public class GameServerTest {

    public static void main(String[] args) {
        GameCharacter one = new GameCharacter(50, "Эльф", new String[]{"лук", "меч", "кастет"});
        GameCharacter two = new GameCharacter(200, "Тролль", new String[] {"голые руки", "большой топор"});
        GameCharacter three = new GameCharacter(120, "Маг", new String[] {"заклинания", "невидимость"});

        //any code that cat change characters

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:\\Users\\User\\IdeaProjects\\AllVPProjects\\AnyProjects\\src\\main\\resources\\game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        one = null;
        two = null;
        three = null;

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("C:\\Users\\User\\IdeaProjects\\AllVPProjects\\AnyProjects\\src\\main\\resources\\game.ser"));
            GameCharacter oneRestore = (GameCharacter) is.readObject();
            GameCharacter twoRestore = (GameCharacter) is.readObject();
            GameCharacter threeRestore = (GameCharacter) is.readObject();

            System.out.println("Type of one: " + oneRestore.getType());
            System.out.println("Type of two: " + twoRestore.getType());
            System.out.println("Type of three: " + threeRestore.getType());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static class GameCharacter implements Serializable {
        int power;
        String type;
        String[] weapons;

        public GameCharacter(int power, String type, String[] weapons) {
            this.power = power;
            this.type = type;
            this.weapons = weapons;
        }

        public int getPower() {
            return power;
        }

        public String getType() {
            return type;
        }

        public String getWeapons() {
            StringBuilder weaponList = new StringBuilder();
            for (int i = 0; i < weapons.length; i++) {
                weaponList.append(weapons[i]).append(" ");
            }
            return weaponList.toString();
        }
    }

}
