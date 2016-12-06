package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationGDPUnitIterator theLocation = (LocationGDPUnitIterator)findAncestorWithClass(this, LocationGDPUnitIterator.class);
			pageContext.getOut().print(theLocation.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

