/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playingwithemployessinterface;

/**
 *
 * @author Arara
 */
public class Teacher extends Employee implements Advisable{

    public Teacher(String name, int salary) {
        super(name, salary);
    }
    
    
    
    public void teach(){
        System.out.println(getName()+ " is teaching"); 
    }

    @Override
    public void giveAdvice() {
        System.out.println(getName() + " is giving advice");
    }

    @Override
    public void work() {
        teach();
    }
    
    
}
