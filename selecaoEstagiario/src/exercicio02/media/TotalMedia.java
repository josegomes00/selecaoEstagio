package exercicio02.media;

public class TotalMedia {
    int media789 = (7+8+9)/3;
    int media456 = (4+5+6)/3;

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
