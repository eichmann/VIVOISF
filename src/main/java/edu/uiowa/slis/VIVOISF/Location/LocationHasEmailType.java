package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationHasEmailIterator theLocationHasEmailIterator = (LocationHasEmailIterator)findAncestorWithClass(this, LocationHasEmailIterator.class);
			pageContext.getOut().print(theLocationHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

