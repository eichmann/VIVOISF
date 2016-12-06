package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationGeographicFocusIterator theLocationGeographicFocusIterator = (LocationGeographicFocusIterator)findAncestorWithClass(this, LocationGeographicFocusIterator.class);
			pageContext.getOut().print(theLocationGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

