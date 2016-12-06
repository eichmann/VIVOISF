package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionCodeFAOSTATIterator theGeographicRegion = (GeographicRegionCodeFAOSTATIterator)findAncestorWithClass(this, GeographicRegionCodeFAOSTATIterator.class);
			pageContext.getOut().print(theGeographicRegion.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

