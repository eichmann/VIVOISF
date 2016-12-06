package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationCodeISO2Iterator theLocation = (LocationCodeISO2Iterator)findAncestorWithClass(this, LocationCodeISO2Iterator.class);
			pageContext.getOut().print(theLocation.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

