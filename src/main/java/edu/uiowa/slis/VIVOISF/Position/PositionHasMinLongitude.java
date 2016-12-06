package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionHasMinLongitudeIterator thePosition = (PositionHasMinLongitudeIterator)findAncestorWithClass(this, PositionHasMinLongitudeIterator.class);
			pageContext.getOut().print(thePosition.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

