package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Country theCountry = (Country)findAncestorWithClass(this, Country.class);
			if (!theCountry.commitNeeded) {
				pageContext.getOut().print(theCountry.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Country for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			Country theCountry = (Country)findAncestorWithClass(this, Country.class);
			return theCountry.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing Country for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			Country theCountry = (Country)findAncestorWithClass(this, Country.class);
			theCountry.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing Country for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for placeOfPublication tag ");
		}
	}
}

