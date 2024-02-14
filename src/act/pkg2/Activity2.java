 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act.pkg2;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * @author User
 */
public class Activity2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] Elements = {50,40,30,20,10};
        
        System.out.println("The 5 Element are : " + Arrays.toString(Elements));
        
        int sum = IntStream.of(Elements).sum();
        
        System.out.println("The sum is :" + sum);
        
        int maxl = Math.max(Elements [0], Math.max(Elements [1], Math.max(Elements [2], Math.max(Elements [3], Elements [4]))));
        
        System.out.println("Maximum Value:" +  maxl );
    }
    
}
