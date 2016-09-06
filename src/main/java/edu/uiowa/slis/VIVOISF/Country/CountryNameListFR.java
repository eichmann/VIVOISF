package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNameListFRIterator theCountry = (CountryNameListFRIterator)findAncestorWithClass(this, CountryNameListFRIterator.class);
			pageContext.getOut().print(theCountry.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

