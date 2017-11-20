public class Main {

    public static void main(String[] args) {
        DVDRW Disc = new DVDRW();
        BLURAY Discc = new BLURAY();
        DVDR Disccc = new DVDR();
        PLAYER player = new PLAYER();
        System.out.println(player.checkDiscType(Disc.sRodzaj));
        System.out.println(player.checkDiscType(Discc.sRodzaj));
        System.out.println(player.checkDiscType(Disccc.sRodzaj));
    }
}
