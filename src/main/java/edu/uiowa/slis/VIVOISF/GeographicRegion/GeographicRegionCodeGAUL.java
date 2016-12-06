package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionCodeGAULIterator theGeographicRegion = (GeographicRegionCodeGAULIterator)findAncestorWithClass(this, GeographicRegionCodeGAULIterator.class);
			pageContext.getOut().print(theGeographicRegion.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

