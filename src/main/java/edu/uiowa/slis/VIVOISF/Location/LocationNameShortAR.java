package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNameShortARIterator theLocation = (LocationNameShortARIterator)findAncestorWithClass(this, LocationNameShortARIterator.class);
			pageContext.getOut().print(theLocation.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

