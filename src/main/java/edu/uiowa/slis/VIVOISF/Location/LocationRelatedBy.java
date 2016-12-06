package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationRelatedByIterator theLocationRelatedByIterator = (LocationRelatedByIterator)findAncestorWithClass(this, LocationRelatedByIterator.class);
			pageContext.getOut().print(theLocationRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

