package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionLandAreaUnitIterator thePrimaryPosition = (PrimaryPositionLandAreaUnitIterator)findAncestorWithClass(this, PrimaryPositionLandAreaUnitIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

