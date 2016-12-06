package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionHasMaxLongitudeIterator thePosition = (PositionHasMaxLongitudeIterator)findAncestorWithClass(this, PositionHasMaxLongitudeIterator.class);
			pageContext.getOut().print(thePosition.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

