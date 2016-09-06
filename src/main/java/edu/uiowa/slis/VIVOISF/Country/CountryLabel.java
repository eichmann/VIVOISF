package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Country theCountry = (Country)findAncestorWithClass(this, Country.class);
			if (!theCountry.commitNeeded) {
				pageContext.getOut().print(theCountry.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Country for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Country theCountry = (Country)findAncestorWithClass(this, Country.class);
			return theCountry.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Country for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Country theCountry = (Country)findAncestorWithClass(this, Country.class);
			theCountry.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Country for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for label tag ");
		}
	}
}

