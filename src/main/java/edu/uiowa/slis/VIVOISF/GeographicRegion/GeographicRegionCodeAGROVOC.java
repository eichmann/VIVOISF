package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionCodeAGROVOCIterator theGeographicRegion = (GeographicRegionCodeAGROVOCIterator)findAncestorWithClass(this, GeographicRegionCodeAGROVOCIterator.class);
			pageContext.getOut().print(theGeographicRegion.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

