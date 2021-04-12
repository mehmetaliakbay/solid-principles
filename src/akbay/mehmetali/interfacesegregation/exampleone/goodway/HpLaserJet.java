package akbay.mehmetali.interfacesegregation.exampleone.goodway;

import java.util.Objects;

public class HpLaserJet implements PrintScanContent, FaxContent, PrintDublex{
    @Override
    public boolean printContent(String content) {
        return false;
    }

    @Override
    public boolean scanContent(String content) {
        return false;
    }

    @Override
    public boolean photoCopyContent(String content) {
        return false;
    }

    @Override
    public boolean faxCount(String content) {
        return false;
    }

    @Override
    public boolean printDublexContent(String content) {
        return false;
    }


}
