package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNameListESIterator theLocation = (LocationNameListESIterator)findAncestorWithClass(this, LocationNameListESIterator.class);
			pageContext.getOut().print(theLocation.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

