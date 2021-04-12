package akbay.mehmetali.dependecyinversion.exampleone.goodway;

public class Sms implements Message{
    @Override
    public void sendMessage() {
        sendEmail();

    }
    private void sendEmail()
    {
        System.out.println("send mail");
    }
}
