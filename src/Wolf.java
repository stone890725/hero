import java.util.Random;

public class Wolf extends Monster{

    public Wolf(){
        super.count++;
        name="Wolf"+Integer.toString(count);
        hp=2000+this.lv*50;
        def=3000;
        atk=100;
        Random ra=new Random(System.currentTimeMillis());
        this.x=ra.nextInt(1024);
        this.y=ra.nextInt(1024);
    }
    public void ShowInfo(){
        System.out.println(this.name);
        super.ShowInfo();
    }
}