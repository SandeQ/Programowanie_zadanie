import com.sun.org.apache.bcel.internal.generic.DUP;

public class Main {

    public static void main(String[] args) {
        CD Dysk = new CD();
        BLURAY Dysk2 = new BLURAY();
        DVDR Dysk3 = new DVDR();
        DUPA DupiatyDysk = new DUPA();
        PLAYER player = new PLAYER();
        System.out.println(player.checkDiscType(Dysk));
        System.out.println(player.checkDiscType(Dysk2));
        System.out.println(player.checkDiscType(Dysk3));
        System.out.println(player.checkDiscType(DupiatyDysk));
    }
}
