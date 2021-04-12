package akbay.mehmetali.dependecyinversion.exampleone.goodway;

public class Email implements Message {
    @Override
    public void sendMessage() {

        sendEmail();
    }
    private void sendEmail()
    {
        System.out.println("send email");
    }
}
