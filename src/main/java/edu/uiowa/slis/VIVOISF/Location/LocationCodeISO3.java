package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationCodeISO3Iterator theLocation = (LocationCodeISO3Iterator)findAncestorWithClass(this, LocationCodeISO3Iterator.class);
			pageContext.getOut().print(theLocation.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

