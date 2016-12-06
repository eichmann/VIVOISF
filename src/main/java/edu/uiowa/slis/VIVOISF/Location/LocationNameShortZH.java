package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNameShortZHIterator theLocation = (LocationNameShortZHIterator)findAncestorWithClass(this, LocationNameShortZHIterator.class);
			pageContext.getOut().print(theLocation.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

