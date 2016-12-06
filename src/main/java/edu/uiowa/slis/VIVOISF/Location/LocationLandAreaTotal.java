package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationLandAreaTotalIterator theLocation = (LocationLandAreaTotalIterator)findAncestorWithClass(this, LocationLandAreaTotalIterator.class);
			pageContext.getOut().print(theLocation.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

