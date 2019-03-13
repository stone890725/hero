
public class Xayah extends hero {

    public Xayah() {
        describe = "逆羽 剎雅";
        hp = 561f;
        mp = 340f;
        reHp = 3.25f;
        reMp = 8.25f;
        speed = 325;
        ad = 60f;
        range = 525;
        adDen = 28f;
        apDen = 30f;
    }

    public float[] attack() {
        float data[] = {this.ad, 0, 0, 0};
        return data;
    }

    public void passive() {

    }

    public float[] skillQ() {
        float data[] = {45, 0, 0, 0};
        return data;
    }

    public void skillW() {
        float data[] = {this.ad * 1.2f, 0, 0, 0};
        return;
    }

    public void skillE() {
        float data[] = {55, 0, 0, 0};
    }

    public void skillR() {
        float data[] = {100, 0, 0, 0};
    }
}