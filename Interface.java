interface TvRemote {
    void powerOn();
    void powerOff();
    void changeChannel(int channel);
    void adjustVolume(int volume);
    void  increasevolume(int increment);
    void decreasevolume(int decrement);
    
}

// Interface for Smart TV remote, inheriting from TvRemote
interface SmartTvRemote extends TvRemote {
    void connectToInternet();
    void navigateSmartMenu();
}

// Implementation of SmartTvRemote
class SmartTvRemoteImpl implements SmartTvRemote {
    @Override
    public void powerOn() {
        System.out.println("Smart TV is powered on");
    }

    @Override
    public void powerOff() {
        System.out.println("Smart TV is powered off");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("Changing channel to " + channel);
    }

    @Override
    public void adjustVolume(int volume) {
        System.out.println("Adjusting volume to " + volume);
    }

    @Override
    public void increasevolume(int increment){
        System.out.println(" increasing volume" + increment);
    }

    @Override
    public void decreasevolume(int decrement){
        System.out.println("decreasing volume"+ decrement) ;
    }

    

    @Override
    public void connectToInternet() {
        System.out.println("Smart TV is connected to the internet");
    }

    @Override
    public void navigateSmartMenu() {
        System.out.println("Navigating through the Smart TV menu");
    }
}

public class Interface {
    public static void main(String[] args) {
        SmartTvRemote smartTvRemote = new SmartTvRemoteImpl();

        smartTvRemote.powerOn();
        smartTvRemote.changeChannel(5);
        smartTvRemote.adjustVolume(20);
        smartTvRemote.connectToInternet();
        smartTvRemote.navigateSmartMenu();
        smartTvRemote.powerOff();
        smartTvRemote.increasevolume(2);
        smartTvRemote.decreasevolume(4);
    }
}

