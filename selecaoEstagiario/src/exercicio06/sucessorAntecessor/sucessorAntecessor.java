package exercicio06.sucessorAntecessor;

public class sucessorAntecessor {
    int num;

    public sucessorAntecessor(int num) {
        this.num = num;
    }

    public sucessorAntecessor() {
    }

    public int sucessor(){
        return num + 1;
    }

    public int antecessor(){
        return num - 1;
    }
}
