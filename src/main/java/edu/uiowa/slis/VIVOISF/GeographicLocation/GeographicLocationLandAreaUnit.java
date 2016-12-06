package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationLandAreaUnitIterator theGeographicLocation = (GeographicLocationLandAreaUnitIterator)findAncestorWithClass(this, GeographicLocationLandAreaUnitIterator.class);
			pageContext.getOut().print(theGeographicLocation.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

