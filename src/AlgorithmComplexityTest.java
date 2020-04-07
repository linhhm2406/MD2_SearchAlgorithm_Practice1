import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao chuoi : ");
        String inputString = scanner.nextLine();

        // Thuat toan tim kiem :
        // T(find) = T(for1) + T(for2) = max(T(for1),T(for2) = max(255,n)
        // Neu n>255 : -> T(find) = O(n);
        // Neu n<=255 : -> T(find) = 255;

        int[] frequentChar = new int[255]; //O(1)
        for (int i = 0; i < inputString.length() ; i++) {  //O(n) . T(for) = O((1+1)*n) = O(n)
            int ascii = (int) inputString.charAt(i); //O(1)
            frequentChar[ascii]++; //O(1)
        }

        int max = 0; //O(1)
        char character = (char) 255;  //O(1)
        for (int i = 0; i < 255; i++) {  //O(255) -> T(for2) = O(255)*T(if) = 255
            if (frequentChar[i] > max){  //O(1) -> T(if) = O(1*(1+1)) = O(2)
                max = frequentChar[i]; //O(1)
                character = (char) i; //O(1)
            }
        }
        System.out.print("Chu cai xuat hien nhieu nhat : " + character);
    }
}
