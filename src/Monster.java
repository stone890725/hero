public class Monster {
    protected String name;
    protected int hp, def, lv;
    protected float atk;
    protected static int count;
    protected int x, y;

    public void ShowInfo() {
        System.out.println( "Lv:" + this.lv + "HP:" + this.hp + "def:" + def + "atk:" + this.atk + "location:" + "(" + x + "," + y + ")");
    }

    public void hurt(float data[]) {
        if (this.hp - data[0] > 0) {
            this.hp -= data[0];
        } else {
            this.hp = 0;
        }
    }
    public float [] attack(){
        float attack[]={this.atk+this.lv*10,50+this.lv*30,0,0};
        return attack;
    }
}