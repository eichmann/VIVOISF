package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationHasURLIterator theGeographicLocationHasURLIterator = (GeographicLocationHasURLIterator)findAncestorWithClass(this, GeographicLocationHasURLIterator.class);
			pageContext.getOut().print(theGeographicLocationHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

