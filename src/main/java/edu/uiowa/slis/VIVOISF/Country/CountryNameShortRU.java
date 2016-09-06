package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNameShortRUIterator theCountry = (CountryNameShortRUIterator)findAncestorWithClass(this, CountryNameShortRUIterator.class);
			pageContext.getOut().print(theCountry.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

