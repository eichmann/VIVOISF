package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNameListRUIterator theCountry = (CountryNameListRUIterator)findAncestorWithClass(this, CountryNameListRUIterator.class);
			pageContext.getOut().print(theCountry.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

