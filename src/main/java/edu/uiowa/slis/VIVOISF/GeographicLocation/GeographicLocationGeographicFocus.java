package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationGeographicFocusIterator theGeographicLocationGeographicFocusIterator = (GeographicLocationGeographicFocusIterator)findAncestorWithClass(this, GeographicLocationGeographicFocusIterator.class);
			pageContext.getOut().print(theGeographicLocationGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

