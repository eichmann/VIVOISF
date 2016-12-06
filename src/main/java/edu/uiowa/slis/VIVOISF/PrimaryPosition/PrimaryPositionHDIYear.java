package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionHDIYearIterator thePrimaryPosition = (PrimaryPositionHDIYearIterator)findAncestorWithClass(this, PrimaryPositionHDIYearIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

