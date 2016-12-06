package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNameShortRUIterator theLocation = (LocationNameShortRUIterator)findAncestorWithClass(this, LocationNameShortRUIterator.class);
			pageContext.getOut().print(theLocation.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

