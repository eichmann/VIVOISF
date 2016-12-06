package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionHasMaxLatitudeIterator thePosition = (PositionHasMaxLatitudeIterator)findAncestorWithClass(this, PositionHasMaxLatitudeIterator.class);
			pageContext.getOut().print(thePosition.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

