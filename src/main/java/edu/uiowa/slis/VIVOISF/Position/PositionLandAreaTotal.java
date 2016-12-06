package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionLandAreaTotalIterator thePosition = (PositionLandAreaTotalIterator)findAncestorWithClass(this, PositionLandAreaTotalIterator.class);
			pageContext.getOut().print(thePosition.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

