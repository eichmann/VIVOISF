package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationUrlIterator theGeographicLocation = (GeographicLocationUrlIterator)findAncestorWithClass(this, GeographicLocationUrlIterator.class);
			pageContext.getOut().print(theGeographicLocation.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for url tag ");
		}
		return SKIP_BODY;
	}
}

