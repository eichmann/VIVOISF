package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationFreetextKeywordIterator theLocation = (LocationFreetextKeywordIterator)findAncestorWithClass(this, LocationFreetextKeywordIterator.class);
			pageContext.getOut().print(theLocation.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

