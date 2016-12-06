package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNameListFRIterator theLocation = (LocationNameListFRIterator)findAncestorWithClass(this, LocationNameListFRIterator.class);
			pageContext.getOut().print(theLocation.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

