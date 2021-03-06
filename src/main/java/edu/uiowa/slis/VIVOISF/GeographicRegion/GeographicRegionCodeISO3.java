package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionCodeISO3Iterator theGeographicRegion = (GeographicRegionCodeISO3Iterator)findAncestorWithClass(this, GeographicRegionCodeISO3Iterator.class);
			pageContext.getOut().print(theGeographicRegion.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

