package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionGDPUnitIterator thePrimaryPosition = (PrimaryPositionGDPUnitIterator)findAncestorWithClass(this, PrimaryPositionGDPUnitIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

