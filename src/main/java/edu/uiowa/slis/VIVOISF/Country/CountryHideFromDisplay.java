package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Country theCountry = (Country)findAncestorWithClass(this, Country.class);
			if (!theCountry.commitNeeded) {
				pageContext.getOut().print(theCountry.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Country for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			Country theCountry = (Country)findAncestorWithClass(this, Country.class);
			return theCountry.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing Country for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			Country theCountry = (Country)findAncestorWithClass(this, Country.class);
			theCountry.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing Country for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for hideFromDisplay tag ");
		}
	}
}

