package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNameOfficialFRIterator theCountry = (CountryNameOfficialFRIterator)findAncestorWithClass(this, CountryNameOfficialFRIterator.class);
			pageContext.getOut().print(theCountry.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

