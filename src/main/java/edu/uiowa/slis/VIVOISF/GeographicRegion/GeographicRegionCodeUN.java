package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionCodeUNIterator theGeographicRegion = (GeographicRegionCodeUNIterator)findAncestorWithClass(this, GeographicRegionCodeUNIterator.class);
			pageContext.getOut().print(theGeographicRegion.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

