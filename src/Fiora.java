public class Fiora  extends hero{

    public Fiora(){
         describe = "孤高劍客 菲歐拉\n"+"蒂瑪西亞";
         hp = 550f;
         mp = 300f;
         reHp = 8.5f;
         reMp = 8.25f;
         speed = 325;
         ad = 60f;
         range = 525;
         adDen = 28f;
         apDen = 30f;
    }

    public float[] attack(){
        float data[]={this.ad,0,0,0};
        return data;
    }

    public void passive() {

    }
    public float [] skillQ(){
        float data[]={70,0,0,0};
        return data;
    }
    public void skillW(){
        float data[]={90,0,0,0};
        return;
    }
    public void skillE(){
        float data[]={this.ad*1.4f,0,0,0};
    }
    public void skillR(){
        float data[]={300,0,0,0};
    }

    }

