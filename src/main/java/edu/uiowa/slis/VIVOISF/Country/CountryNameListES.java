package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNameListESIterator theCountry = (CountryNameListESIterator)findAncestorWithClass(this, CountryNameListESIterator.class);
			pageContext.getOut().print(theCountry.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

