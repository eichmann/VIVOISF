package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationRelatedByIterator theGeographicLocationRelatedByIterator = (GeographicLocationRelatedByIterator)findAncestorWithClass(this, GeographicLocationRelatedByIterator.class);
			pageContext.getOut().print(theGeographicLocationRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

