public class User {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.increaseVolume();
        smartTv.increaseVolume();
        smartTv.increaseVolume();
        smartTv.increaseVolume();

        smartTv.changeChannel(13);

        System.out.println("TV on? " + smartTv.on);
        System.out.println("Current channel? " + smartTv.channel);
        System.out.println("Current volume? " + smartTv.volume);

        smartTv.setOn();
        System.out.println("New status - TV on? " + smartTv.on);

        smartTv.setOff();
        System.out.println("New status - TV on? " + smartTv.on);


    }
}