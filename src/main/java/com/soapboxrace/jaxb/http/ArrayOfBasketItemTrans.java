
package com.soapboxrace.jaxb.http;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfBasketItemTrans complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBasketItemTrans">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BasketItemTrans" type="{}BasketItemTrans" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBasketItemTrans", propOrder = {
    "basketItemTrans"
})
public class ArrayOfBasketItemTrans {

    @XmlElement(name = "BasketItemTrans", nillable = true)
    protected List<BasketItemTrans> basketItemTrans;

    /**
     * Gets the value of the basketItemTrans property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basketItemTrans property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasketItemTrans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasketItemTrans }
     * 
     * 
     */
    public List<BasketItemTrans> getBasketItemTrans() {
        if (basketItemTrans == null) {
            basketItemTrans = new ArrayList<BasketItemTrans>();
        }
        return this.basketItemTrans;
    }

}