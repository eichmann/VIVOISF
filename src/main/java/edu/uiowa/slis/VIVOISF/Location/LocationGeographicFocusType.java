package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationGeographicFocusIterator theLocationGeographicFocusIterator = (LocationGeographicFocusIterator)findAncestorWithClass(this, LocationGeographicFocusIterator.class);
			pageContext.getOut().print(theLocationGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

