package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionHDIYearIterator thePosition = (PositionHDIYearIterator)findAncestorWithClass(this, PositionHDIYearIterator.class);
			pageContext.getOut().print(thePosition.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

