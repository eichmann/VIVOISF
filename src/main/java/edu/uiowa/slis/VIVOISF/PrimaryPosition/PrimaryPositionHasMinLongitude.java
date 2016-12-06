package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionHasMinLongitudeIterator thePrimaryPosition = (PrimaryPositionHasMinLongitudeIterator)findAncestorWithClass(this, PrimaryPositionHasMinLongitudeIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

