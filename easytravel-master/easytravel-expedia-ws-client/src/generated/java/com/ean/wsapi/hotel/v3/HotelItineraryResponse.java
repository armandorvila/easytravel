
package com.ean.wsapi.hotel.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HotelItineraryResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HotelItineraryResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v3.hotel.wsapi.ean.com/}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="Itinerary" type="{http://v3.hotel.wsapi.ean.com/}Itinerary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="size" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelItineraryResponse", propOrder = {
    "itinerary"
})
public class HotelItineraryResponse
    extends BaseResponse
{

    @XmlElement(name = "Itinerary")
    protected List<Itinerary> itinerary;
    @XmlAttribute(name = "size", required = true)
    protected int size;

    /**
     * Gets the value of the itinerary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itinerary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItinerary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Itinerary }
     * 
     * 
     */
    public List<Itinerary> getItinerary() {
        if (itinerary == null) {
            itinerary = new ArrayList<Itinerary>();
        }
        return this.itinerary;
    }

    /**
     * Obtiene el valor de la propiedad size.
     * 
     */
    public int getSize() {
        return size;
    }

    /**
     * Define el valor de la propiedad size.
     * 
     */
    public void setSize(int value) {
        this.size = value;
    }

}
