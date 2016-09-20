package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationValidInInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationValidInInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationValidInInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationValidInInverseIterator theGeographicLocationValidInInverseIterator = (GeographicLocationValidInInverseIterator)findAncestorWithClass(this, GeographicLocationValidInInverseIterator.class);
			pageContext.getOut().print(theGeographicLocationValidInInverseIterator.getValidInInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for validIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for validIn tag ");
		}
		return SKIP_BODY;
	}
}

