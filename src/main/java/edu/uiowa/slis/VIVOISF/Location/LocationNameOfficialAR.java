package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNameOfficialARIterator theLocation = (LocationNameOfficialARIterator)findAncestorWithClass(this, LocationNameOfficialARIterator.class);
			pageContext.getOut().print(theLocation.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

