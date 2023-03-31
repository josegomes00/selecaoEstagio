package exercicio02.media;

public class TotalMedia {
    private int media789 = (7+8+9)/3;
    private int media456 = (4+5+6)/3;

    public TotalMedia() {
    }

    public int getMedia789() {
        return media789;
    }

    public void setMedia789(int media789) {
        this.media789 = media789;
    }

    public int getMedia456() {
        return media456;
    }

    public void setMedia456(int media456) {
        this.media456 = media456;
    }

    public int SomaMedias(){
        int somaMedias = media456 + media789;
        return somaMedias;
    }

    public double mediaMedias(){
        double mediaMedias = SomaMedias();
        mediaMedias = mediaMedias/2;
        return mediaMedias;
    }
    
    
}
