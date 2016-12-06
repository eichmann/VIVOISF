package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionLandAreaUnitIterator thePosition = (PositionLandAreaUnitIterator)findAncestorWithClass(this, PositionLandAreaUnitIterator.class);
			pageContext.getOut().print(thePosition.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

