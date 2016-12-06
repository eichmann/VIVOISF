package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationDescriptionIterator theGeographicLocation = (GeographicLocationDescriptionIterator)findAncestorWithClass(this, GeographicLocationDescriptionIterator.class);
			pageContext.getOut().print(theGeographicLocation.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for description tag ");
		}
		return SKIP_BODY;
	}
}

