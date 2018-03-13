package clientwsgeolip;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root (name = "GeoIP")
public class GeoIP {
    @Element (name = "ReturnCode", required = false)
    private String returnCode;
    @Element (name = "IP")
    private String Ip;
    @Element (name = "ReturnCodeDetails")
    private String ReturnCodeDetails;
    @Element (name = "CountryName")
    private String CountryName;
    @Element (name = "CountryCode")
    private String CountryCode;

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getIp() {
        return Ip;
    }

    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    public String getReturnCodeDetails() {
        return ReturnCodeDetails;
    }

    public void setReturnCodeDetails(String ReturnCodeDetails) {
        this.ReturnCodeDetails = ReturnCodeDetails;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String CountryName) {
        this.CountryName = CountryName;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }
}
