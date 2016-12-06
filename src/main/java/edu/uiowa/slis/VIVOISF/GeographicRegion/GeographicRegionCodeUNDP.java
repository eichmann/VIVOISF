package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionCodeUNDPIterator theGeographicRegion = (GeographicRegionCodeUNDPIterator)findAncestorWithClass(this, GeographicRegionCodeUNDPIterator.class);
			pageContext.getOut().print(theGeographicRegion.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

