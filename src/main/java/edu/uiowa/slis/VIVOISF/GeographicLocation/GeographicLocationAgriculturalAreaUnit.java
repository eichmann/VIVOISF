package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationAgriculturalAreaUnitIterator theGeographicLocation = (GeographicLocationAgriculturalAreaUnitIterator)findAncestorWithClass(this, GeographicLocationAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theGeographicLocation.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

