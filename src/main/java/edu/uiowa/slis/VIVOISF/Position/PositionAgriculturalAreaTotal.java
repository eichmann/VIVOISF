package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionAgriculturalAreaTotalIterator thePosition = (PositionAgriculturalAreaTotalIterator)findAncestorWithClass(this, PositionAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(thePosition.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

