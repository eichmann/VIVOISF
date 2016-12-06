package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionGeographicFocusIterator thePrimaryPositionGeographicFocusIterator = (PrimaryPositionGeographicFocusIterator)findAncestorWithClass(this, PrimaryPositionGeographicFocusIterator.class);
			pageContext.getOut().print(thePrimaryPositionGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

