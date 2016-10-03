package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherHasCoordinate extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherHasCoordinate currentInstance = null;
	private static final Log log = LogFactory.getLog(otherHasCoordinate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherHasCoordinateIterator theother = (otherHasCoordinateIterator)findAncestorWithClass(this, otherHasCoordinateIterator.class);
			pageContext.getOut().print(theother.getHasCoordinate());
		} catch (Exception e) {
			log.error("Can't find enclosing other for hasCoordinate tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for hasCoordinate tag ");
		}
		return SKIP_BODY;
	}
}

