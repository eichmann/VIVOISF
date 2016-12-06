package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNameListRUIterator theLocation = (LocationNameListRUIterator)findAncestorWithClass(this, LocationNameListRUIterator.class);
			pageContext.getOut().print(theLocation.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

