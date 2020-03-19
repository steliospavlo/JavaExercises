package playingwithemployessinterface;

public class Director extends Employee implements Advisable, Driving{
    
     public Director(String name, int salary) {
        super(name, salary);
    }
     
    public void guide(){
        System.out.println(getName() + " is  guiding");
    }

    @Override
    public void giveAdvice() {
        System.out.println(getName() + " is giving advice");
    }

    @Override
    public void driving() {
         System.out.println(getName() + " is driving");
    }

    @Override
    public void work() {
        guide();
    }
}
