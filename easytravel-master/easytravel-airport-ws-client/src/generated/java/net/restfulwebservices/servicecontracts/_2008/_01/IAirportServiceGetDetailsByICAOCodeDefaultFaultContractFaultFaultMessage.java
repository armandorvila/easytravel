
package net.restfulwebservices.servicecontracts._2008._01;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.3
 * 2014-03-15T22:03:32.733+01:00
 * Generated source version: 2.7.3
 */

@WebFault(name = "DefaultFaultContract", targetNamespace = "http://GOTLServices.FaultContracts/2008/01")
public class IAirportServiceGetDetailsByICAOCodeDefaultFaultContractFaultFaultMessage extends Exception {
    
    private faultcontracts.gotlservices._2008._01.DefaultFaultContract defaultFaultContract;

    public IAirportServiceGetDetailsByICAOCodeDefaultFaultContractFaultFaultMessage() {
        super();
    }
    
    public IAirportServiceGetDetailsByICAOCodeDefaultFaultContractFaultFaultMessage(String message) {
        super(message);
    }
    
    public IAirportServiceGetDetailsByICAOCodeDefaultFaultContractFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IAirportServiceGetDetailsByICAOCodeDefaultFaultContractFaultFaultMessage(String message, faultcontracts.gotlservices._2008._01.DefaultFaultContract defaultFaultContract) {
        super(message);
        this.defaultFaultContract = defaultFaultContract;
    }

    public IAirportServiceGetDetailsByICAOCodeDefaultFaultContractFaultFaultMessage(String message, faultcontracts.gotlservices._2008._01.DefaultFaultContract defaultFaultContract, Throwable cause) {
        super(message, cause);
        this.defaultFaultContract = defaultFaultContract;
    }

    public faultcontracts.gotlservices._2008._01.DefaultFaultContract getFaultInfo() {
        return this.defaultFaultContract;
    }
}
