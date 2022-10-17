/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package template_pattern;

/**
 *
 * @author admin
 */
public class TemplatePatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
        System.out.println("Finish!");
    }
    
}
