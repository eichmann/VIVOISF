package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationRO_0001025.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationRO_0001025Iterator theLocationRO_0001025Iterator = (LocationRO_0001025Iterator)findAncestorWithClass(this, LocationRO_0001025Iterator.class);
			pageContext.getOut().print(theLocationRO_0001025Iterator.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

