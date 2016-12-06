package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PositionGeographicFocusIterator thePositionGeographicFocusIterator = (PositionGeographicFocusIterator)findAncestorWithClass(this, PositionGeographicFocusIterator.class);
			pageContext.getOut().print(thePositionGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

