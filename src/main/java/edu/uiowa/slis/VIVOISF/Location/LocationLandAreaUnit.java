package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationLandAreaUnitIterator theLocation = (LocationLandAreaUnitIterator)findAncestorWithClass(this, LocationLandAreaUnitIterator.class);
			pageContext.getOut().print(theLocation.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

