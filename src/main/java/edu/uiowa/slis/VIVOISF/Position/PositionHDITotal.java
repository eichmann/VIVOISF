package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionHDITotalIterator thePosition = (PositionHDITotalIterator)findAncestorWithClass(this, PositionHDITotalIterator.class);
			pageContext.getOut().print(thePosition.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

