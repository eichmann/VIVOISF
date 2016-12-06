package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionHasSubjectArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionHasSubjectArea currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionHasSubjectArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionHasSubjectAreaIterator theGeographicRegionHasSubjectAreaIterator = (GeographicRegionHasSubjectAreaIterator)findAncestorWithClass(this, GeographicRegionHasSubjectAreaIterator.class);
			pageContext.getOut().print(theGeographicRegionHasSubjectAreaIterator.getHasSubjectArea());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

