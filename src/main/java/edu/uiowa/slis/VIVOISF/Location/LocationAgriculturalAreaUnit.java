package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationAgriculturalAreaUnitIterator theLocation = (LocationAgriculturalAreaUnitIterator)findAncestorWithClass(this, LocationAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theLocation.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

