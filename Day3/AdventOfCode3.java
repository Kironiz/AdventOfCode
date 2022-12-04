package Day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdventOfCode3 {

    public static void main(String[] args) throws FileNotFoundException {
        File data = new File("Day3/StuffInBackpacks.txt");
        Scanner scanner = new Scanner(data);
        int counter = 0;
        ArrayList<String> compareFront = new ArrayList<>();
        ArrayList<String> compareBack = new ArrayList();

        while (true) {
            compareFront.clear();
            compareBack.clear();
            
            // If no more lines are given, ends the loop.
            if (!scanner.hasNext()) {
                break;
            }
            String stuff = scanner.nextLine();
            // Getting the length of the entire Line
            int lengthString = stuff.length();
            // Splitting up the String into smaller parts.
            String[] items = stuff.split("");
            // Counting the priority Value
            int priorities = 0;
            int halfLength = lengthString / 2;

            // Splitting the values up into their compartments
            for (int i = 0; i < halfLength; i++) {
                compareFront.add(items[i]);
            }
            for (int i = 0; i < halfLength; i++) {
                compareBack.add(items[i + halfLength]);
            }
            for (String e : compareFront) {
                if (compareBack.contains(e)) {
                    // Comparing all the first parts with their counterparts and adding their
                    // appropriate values to priorities
                    if (e.equals("a")) {
                        priorities += 1;
                    } else if (e.equals("b")) {
                        priorities += 2;
                    } else if (e.equals("c")) {
                        priorities += 3;
                    } else if (e.equals("d")) {
                        priorities += 4;
                    } else if (e.equals("e")) {
                        priorities += 5;
                    } else if (e.equals("f")) {
                        priorities += 6;
                    } else if (e.equals("g")) {
                        priorities += 7;
                    } else if (e.equals("h")) {
                        priorities += 8;
                    } else if (e.equals("i")) {
                        priorities += 9;
                    } else if (e.equals("j")) {
                        priorities += 10;
                    } else if (e.equals("k")) {
                        priorities += 11;
                    } else if (e.equals("l")) {
                        priorities += 12;
                    } else if (e.equals("m")) {
                        priorities += 13;
                    } else if (e.equals("n")) {
                        priorities += 14;
                    } else if (e.equals("o")) {
                        priorities += 15;
                    } else if (e.equals("p")) {
                        priorities += 16;
                    } else if (e.equals("q")) {
                        priorities += 17;
                    } else if (e.equals("r")) {
                        priorities += 18;
                    } else if (e.equals("s")) {
                        priorities += 19;
                    } else if (e.equals("t")) {
                        priorities += 20;
                    } else if (e.equals("u")) {
                        priorities += 21;
                    } else if (e.equals("v")) {
                        priorities += 22;
                    } else if (e.equals("w")) {
                        priorities += 23;
                    } else if (e.equals("x")) {
                        priorities += 24;
                    } else if (e.equals("y")) {
                        priorities += 25;
                    } else if (e.equals("z")) {
                        priorities += 26;
                    } else if (e.equals("A")) {
                        priorities += 27;
                    } else if (e.equals("B")) {
                        priorities += 28;
                    } else if (e.equals("C")) {
                        priorities += 29;
                    } else if (e.equals("D")) {
                        priorities += 30;
                    } else if (e.equals("E")) {
                        priorities += 31;
                    } else if (e.equals("F")) {
                        priorities += 32;
                    } else if (e.equals("G")) {
                        priorities += 33;
                    } else if (e.equals("H")) {
                        priorities += 34;
                    } else if (e.equals("I")) {
                        priorities += 35;
                    } else if (e.equals("J")) {
                        priorities += 36;
                    } else if (e.equals("K")) {
                        priorities += 37;
                    } else if (e.equals("L")) {
                        priorities += 38;
                    } else if (e.equals("M")) {
                        priorities += 39;
                    } else if (e.equals("N")) {
                        priorities += 40;
                    } else if (e.equals("O")) {
                        priorities += 41;
                    } else if (e.equals("P")) {
                        priorities += 42;
                    } else if (e.equals("Q")) {
                        priorities += 43;
                    } else if (e.equals("R")) {
                        priorities += 44;
                    } else if (e.equals("S")) {
                        priorities += 45;
                    } else if (e.equals("T")) {
                        priorities += 46;
                    } else if (e.equals("U")) {
                        priorities += 47;
                    } else if (e.equals("V")) {
                        priorities += 48;
                    } else if (e.equals("W")) {
                        priorities += 49;
                    } else if (e.equals("X")) {
                        priorities += 50;
                    } else if (e.equals("Y")) {
                        priorities += 51;
                    } else if (e.equals("Z")) {
                        priorities += 52;
                    }
                }
            }
            counter += priorities;

        }
        System.out.println(counter);

    }

}
