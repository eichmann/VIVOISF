package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNameOfficialZHIterator theLocation = (LocationNameOfficialZHIterator)findAncestorWithClass(this, LocationNameOfficialZHIterator.class);
			pageContext.getOut().print(theLocation.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

