package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNameOfficialFRIterator theLocation = (LocationNameOfficialFRIterator)findAncestorWithClass(this, LocationNameOfficialFRIterator.class);
			pageContext.getOut().print(theLocation.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

