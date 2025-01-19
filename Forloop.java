// public class Forloop {

//     public static void main(String[]args){

//         String name= "nihal"; 

//         int size = name.length();

//         for( int i =0;i<size;i++){

//             System.out.println(name.charAt(i));
//         }

// }
// }
// 

// We have one string and you have to find out how many vowels in it.
public class Forloop {

    public static void main(String[] args) {

        int vowelSize = 0;

        String name = "NIHAL";

        int size = name.length();

        int i = 0;
        while (i < size) {
            char character = name.charAt(i);
            // System.out.println(character);

            if (character == 'A' || character == 'I' || character == 'E' || character == 'O' || character == 'U') {

                System.out.println("vowels " + character);

                vowelSize++;

            }

            i++;

        }

        System.out.println("size of vowenl=" + vowelSize);

    }
}
