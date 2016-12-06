package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionCodeISO2Iterator theGeographicRegion = (GeographicRegionCodeISO2Iterator)findAncestorWithClass(this, GeographicRegionCodeISO2Iterator.class);
			pageContext.getOut().print(theGeographicRegion.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

