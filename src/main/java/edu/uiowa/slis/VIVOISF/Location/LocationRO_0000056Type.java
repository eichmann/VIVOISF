package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationRO_0000056Iterator theLocationRO_0000056Iterator = (LocationRO_0000056Iterator)findAncestorWithClass(this, LocationRO_0000056Iterator.class);
			pageContext.getOut().print(theLocationRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

