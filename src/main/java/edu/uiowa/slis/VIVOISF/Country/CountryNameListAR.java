package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNameListARIterator theCountry = (CountryNameListARIterator)findAncestorWithClass(this, CountryNameListARIterator.class);
			pageContext.getOut().print(theCountry.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

