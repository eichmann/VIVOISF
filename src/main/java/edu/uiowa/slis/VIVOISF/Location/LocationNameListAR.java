package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNameListARIterator theLocation = (LocationNameListARIterator)findAncestorWithClass(this, LocationNameListARIterator.class);
			pageContext.getOut().print(theLocation.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

