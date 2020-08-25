/**
 * Follow instructions in the Readme.md 
 * IMPORTANT:  You can only use:
 *      hop()
 *      plant()
 *
 *  Use left and right arrow keys to see it when running main()
 */
public class Main implements Directions {

    /**
     * Do NOT edit this.  Put your code inside the runJerooCode method below.
     */
    public static void main(String[] args) {
//        new JerooGUI();
        runJerooCode();
   }

   
    public static void runJerooCode() {
      Jeroo kim = new Jeroo(0, 0, EAST, 1);
      kim.hop();
      kim.hop();
      kim.hop();
      kim.hop();
      kim.hop();
      kim.plant();
      kim.hop(); 
    }

}
