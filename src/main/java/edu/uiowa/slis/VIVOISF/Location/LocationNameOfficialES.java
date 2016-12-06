package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNameOfficialESIterator theLocation = (LocationNameOfficialESIterator)findAncestorWithClass(this, LocationNameOfficialESIterator.class);
			pageContext.getOut().print(theLocation.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

