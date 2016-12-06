package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNameOfficialRUIterator theLocation = (LocationNameOfficialRUIterator)findAncestorWithClass(this, LocationNameOfficialRUIterator.class);
			pageContext.getOut().print(theLocation.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

