package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNameOfficialITIterator theLocation = (LocationNameOfficialITIterator)findAncestorWithClass(this, LocationNameOfficialITIterator.class);
			pageContext.getOut().print(theLocation.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

