import java.util.Scanner;

public class BitManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bit = sc.nextInt();

        // int n = sc.nextInt();

        // int bitmask = 1 << n;

        // // get bit
        // if ((bit & bitmask) == 0) {
        // System.out.println("the bit was 0");
        // } else if ((bit & bitmask) !== 0) {
        // System.out.println("The bit was 1");
        // } else {
        // System.out.println("ERROR! " + (bit & bitmask));
        // System.out.println("Bit! " + bit);
        // System.out.println("bitmask! " + bitmask);
        // }

        // // set bit
        // int newBit = (bit | bitmask);
        // System.out.println(newBit);

        // // clear bit
        // int newBit = (~(bitmask) & bit);
        // System.out.println(newBit);

        // // if a number is the power of 2
        // if ((bit & (bit - 1)) == 0) {
        // System.out.println("Yes");
        // } else {
        // System.out.println("No");
        // }

        // // toggle the bit of a given position
        // int newBit;

        // if ((bit & bitmask) == 0) {
        // newBit = (bit | bitmask);
        // } else {
        // newBit = bit | (~bitmask);
        // }

        // System.out.println(newBit);

        // Numbers of 1`s in a number in binary
        int numbsOfOne = 0;

        String bin = Integer.toBinaryString(bit);

        System.out.println(bin);

        for (int i = 0; i < bin.length(); i++) {
            if ((bin.charAt(i)) == '1') {
                numbsOfOne++;
            }
        }

        System.out.println(numbsOfOne);
    }
}
