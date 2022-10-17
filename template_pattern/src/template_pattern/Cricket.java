/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package template_pattern;

/**
 *
 * @author admin
 */
public class Cricket extends Game{
    @Override
    void endPlay(){
        System.out.println("Cricket Game Finished!");
    }
    
    @Override
    void initialize(){
        System.out.println("Cricket Game Initialized! Start Playing.");
    }
    
    @Override
    void startPlay(){
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
