package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationHasURLIterator theGeographicLocationHasURLIterator = (GeographicLocationHasURLIterator)findAncestorWithClass(this, GeographicLocationHasURLIterator.class);
			pageContext.getOut().print(theGeographicLocationHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

