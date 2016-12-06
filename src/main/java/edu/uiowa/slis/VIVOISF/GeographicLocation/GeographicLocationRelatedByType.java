package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationRelatedByIterator theGeographicLocationRelatedByIterator = (GeographicLocationRelatedByIterator)findAncestorWithClass(this, GeographicLocationRelatedByIterator.class);
			pageContext.getOut().print(theGeographicLocationRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

