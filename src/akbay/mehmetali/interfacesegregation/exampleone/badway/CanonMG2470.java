package akbay.mehmetali.interfacesegregation.exampleone.badway;

/**
 * we have canon scanner bu this scanner can not print
 * because that is not its feature therefore ıt ıs best
 * practice to segregate our interfaces
 */
public class CanonMG2470 implements PrintTasks{
    @Override
    public boolean printContent(String content) {
        return false;
    }

    @Override
    public boolean scanContent(String content) {
        return false;
    }

    @Override
    public boolean faxContent(String content) {
        return false;
    }

    @Override
    public boolean photoCopyContent(String content) {
        return false;
    }
}
