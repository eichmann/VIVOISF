package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNameListZHIterator theLocation = (LocationNameListZHIterator)findAncestorWithClass(this, LocationNameListZHIterator.class);
			pageContext.getOut().print(theLocation.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

