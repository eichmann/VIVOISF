package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationGDPUnitIterator theGeographicLocation = (GeographicLocationGDPUnitIterator)findAncestorWithClass(this, GeographicLocationGDPUnitIterator.class);
			pageContext.getOut().print(theGeographicLocation.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

