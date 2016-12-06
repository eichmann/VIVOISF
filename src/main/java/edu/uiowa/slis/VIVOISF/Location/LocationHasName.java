package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationHasNameIterator theLocationHasNameIterator = (LocationHasNameIterator)findAncestorWithClass(this, LocationHasNameIterator.class);
			pageContext.getOut().print(theLocationHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for hasName tag ");
		}
		return SKIP_BODY;
	}
}

