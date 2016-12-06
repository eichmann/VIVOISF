package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionHasMaxLatitudeIterator thePrimaryPosition = (PrimaryPositionHasMaxLatitudeIterator)findAncestorWithClass(this, PrimaryPositionHasMaxLatitudeIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

