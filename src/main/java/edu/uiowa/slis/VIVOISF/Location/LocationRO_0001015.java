package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationRO_0001015 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationRO_0001015 currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationRO_0001015.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationRO_0001015Iterator theLocationRO_0001015Iterator = (LocationRO_0001015Iterator)findAncestorWithClass(this, LocationRO_0001015Iterator.class);
			pageContext.getOut().print(theLocationRO_0001015Iterator.getRO_0001015());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

