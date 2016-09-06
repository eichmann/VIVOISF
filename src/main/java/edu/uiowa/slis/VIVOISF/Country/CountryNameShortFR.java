package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNameShortFRIterator theCountry = (CountryNameShortFRIterator)findAncestorWithClass(this, CountryNameShortFRIterator.class);
			pageContext.getOut().print(theCountry.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

