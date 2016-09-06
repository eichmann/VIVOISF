package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNameShortARIterator theCountry = (CountryNameShortARIterator)findAncestorWithClass(this, CountryNameShortARIterator.class);
			pageContext.getOut().print(theCountry.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

