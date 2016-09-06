package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationHasURLIterator theLocationHasURLIterator = (LocationHasURLIterator)findAncestorWithClass(this, LocationHasURLIterator.class);
			pageContext.getOut().print(theLocationHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

