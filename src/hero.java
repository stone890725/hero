public class hero {
    protected String describe;
    protected float hp ,mp ,reHp,reMp,ad,adDen,apDen;
    protected int speed,range;
    public hero(){

    }
public void showInfo(){
    System.out.println(this.describe);
    System.out.println("hp:"+this.hp);
    System.out.println("speed:"+this.speed);
    System.out.println("adDen:"+this.adDen);
    System.out.println("apDen:"+this.apDen);
}

    public void hurt(float data[]){
        if (this.hp-data[0]>0){
            this.hp-=data[0];
        }
        else {
            this.hp=0;
        }
        if (this.speed-data[1]>0){
            this.speed-=data[1];
        }
        else {
            this.speed=0;
        }
        if (this.apDen-data[2]>0){
            this.adDen-=data[2];
        }
        else {
            adDen=0;
        }
        if (this.apDen-data[3]>0){
            this.apDen-=data[3];
        }
        else {
            this.apDen=0;
        }
    }

}