package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionCodeFAOTERMIterator theGeographicRegion = (GeographicRegionCodeFAOTERMIterator)findAncestorWithClass(this, GeographicRegionCodeFAOTERMIterator.class);
			pageContext.getOut().print(theGeographicRegion.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

