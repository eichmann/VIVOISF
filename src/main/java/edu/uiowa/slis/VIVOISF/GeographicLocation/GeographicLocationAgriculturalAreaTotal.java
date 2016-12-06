package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationAgriculturalAreaTotalIterator theGeographicLocation = (GeographicLocationAgriculturalAreaTotalIterator)findAncestorWithClass(this, GeographicLocationAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theGeographicLocation.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

