package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionGDPUnitIterator thePosition = (PositionGDPUnitIterator)findAncestorWithClass(this, PositionGDPUnitIterator.class);
			pageContext.getOut().print(thePosition.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

