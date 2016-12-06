package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNameShortFRIterator theLocation = (LocationNameShortFRIterator)findAncestorWithClass(this, LocationNameShortFRIterator.class);
			pageContext.getOut().print(theLocation.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

