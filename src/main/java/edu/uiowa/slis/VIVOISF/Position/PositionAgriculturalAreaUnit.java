package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionAgriculturalAreaUnitIterator thePosition = (PositionAgriculturalAreaUnitIterator)findAncestorWithClass(this, PositionAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(thePosition.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

