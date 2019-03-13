public class Lulu extends hero{

    public Lulu() {
       describe = "精靈魔法使 露璐 Lulu\n" +
                "班德爾城";
        hp = 525f;
        mp = 350f;
        reHp = 6f;
        reMp = 11f;
        speed = 330;
        ad = 46.368f;
        range = 550;
        adDen = 28.22f;
        apDen = 30f;
    }

    public float[] attack(){
        float data []={this.ad,0,0,0};//hp,speed,adDen,apDen;
        return data;
    }

    public void passive() {

    }
    public float [] skillQ(){
        float data[]={80,0.8f,0,0};
        return data;
    }
    public void skillW(){
        float data[]={0,60,0,0};
        return;
    }
    public void skillE(){
        float data[]={80,0,0,0};
    }
    public void skillR(){
        float data[]={300,0,0,0};
    }

}