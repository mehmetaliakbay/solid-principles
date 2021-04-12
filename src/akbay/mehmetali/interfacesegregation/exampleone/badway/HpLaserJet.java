package akbay.mehmetali.interfacesegregation.exampleone.badway;

public class HpLaserJet implements PrintTasks {
    @Override
    public boolean printContent(String content) {
        System.out.println("Print Done");
        return true;
    }

    @Override
    public boolean scanContent(String content) {
        System.out.println("Scan Done");
        return true;
    }

    @Override
    public boolean faxContent(String content) {
        System.out.println("Fax Done");
        return true;

    }

    @Override
    public boolean photoCopyContent(String content) {
        System.out.println("Photo Done");
        return true;
    }
}
