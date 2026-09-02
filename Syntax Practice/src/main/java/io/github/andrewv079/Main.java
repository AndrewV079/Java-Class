package io.github.andrewv079;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        byte a = 127;
        byte neg_a = -128;
        short b = 32767;
        short neg_b = -32768;
        int c = 2147483647;
        int neg_c = -2147483648;
        long d = 2147483648L;

        FakeClass ourFake = new FakeClass(19, "Andrew", "Vichitbandha");
        System.out.println(ourFake.FirstName);
        }
    }
