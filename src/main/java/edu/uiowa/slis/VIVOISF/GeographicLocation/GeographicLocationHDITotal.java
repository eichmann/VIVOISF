package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationHDITotalIterator theGeographicLocation = (GeographicLocationHDITotalIterator)findAncestorWithClass(this, GeographicLocationHDITotalIterator.class);
			pageContext.getOut().print(theGeographicLocation.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

