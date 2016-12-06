package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationUrlIterator theLocation = (LocationUrlIterator)findAncestorWithClass(this, LocationUrlIterator.class);
			pageContext.getOut().print(theLocation.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for url tag ");
		}
		return SKIP_BODY;
	}
}

