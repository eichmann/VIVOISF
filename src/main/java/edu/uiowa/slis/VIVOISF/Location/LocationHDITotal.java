package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationHDITotalIterator theLocation = (LocationHDITotalIterator)findAncestorWithClass(this, LocationHDITotalIterator.class);
			pageContext.getOut().print(theLocation.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

