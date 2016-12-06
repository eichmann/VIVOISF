package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationGeographicFocusIterator theGeographicLocationGeographicFocusIterator = (GeographicLocationGeographicFocusIterator)findAncestorWithClass(this, GeographicLocationGeographicFocusIterator.class);
			pageContext.getOut().print(theGeographicLocationGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

