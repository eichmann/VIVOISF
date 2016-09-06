package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNameOfficialRUIterator theCountry = (CountryNameOfficialRUIterator)findAncestorWithClass(this, CountryNameOfficialRUIterator.class);
			pageContext.getOut().print(theCountry.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

