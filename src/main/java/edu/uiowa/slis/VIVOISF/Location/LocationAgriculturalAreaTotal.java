package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationAgriculturalAreaTotalIterator theLocation = (LocationAgriculturalAreaTotalIterator)findAncestorWithClass(this, LocationAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theLocation.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

