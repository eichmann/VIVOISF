package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionLandAreaTotalIterator thePrimaryPosition = (PrimaryPositionLandAreaTotalIterator)findAncestorWithClass(this, PrimaryPositionLandAreaTotalIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

