package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationRelatesIterator theLocationRelatesIterator = (LocationRelatesIterator)findAncestorWithClass(this, LocationRelatesIterator.class);
			pageContext.getOut().print(theLocationRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for relates tag ");
		}
		return SKIP_BODY;
	}
}

