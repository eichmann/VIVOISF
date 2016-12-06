package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionHasMaxLongitudeIterator thePrimaryPosition = (PrimaryPositionHasMaxLongitudeIterator)findAncestorWithClass(this, PrimaryPositionHasMaxLongitudeIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

