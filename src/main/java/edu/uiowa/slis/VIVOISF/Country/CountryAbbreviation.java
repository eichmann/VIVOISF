package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Country theCountry = (Country)findAncestorWithClass(this, Country.class);
			if (!theCountry.commitNeeded) {
				pageContext.getOut().print(theCountry.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Country for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Country theCountry = (Country)findAncestorWithClass(this, Country.class);
			return theCountry.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Country for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Country theCountry = (Country)findAncestorWithClass(this, Country.class);
			theCountry.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Country for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for abbreviation tag ");
		}
	}
}

