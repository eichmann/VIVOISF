package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationHasResearchAreaIterator theGeographicLocationHasResearchAreaIterator = (GeographicLocationHasResearchAreaIterator)findAncestorWithClass(this, GeographicLocationHasResearchAreaIterator.class);
			pageContext.getOut().print(theGeographicLocationHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

