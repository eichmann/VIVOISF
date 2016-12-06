package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionHasMinLatitudeIterator thePosition = (PositionHasMinLatitudeIterator)findAncestorWithClass(this, PositionHasMinLatitudeIterator.class);
			pageContext.getOut().print(thePosition.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

