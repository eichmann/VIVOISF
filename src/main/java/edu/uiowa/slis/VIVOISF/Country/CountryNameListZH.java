package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNameListZHIterator theCountry = (CountryNameListZHIterator)findAncestorWithClass(this, CountryNameListZHIterator.class);
			pageContext.getOut().print(theCountry.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

