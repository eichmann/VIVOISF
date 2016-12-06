package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionGDPYearIterator thePrimaryPosition = (PrimaryPositionGDPYearIterator)findAncestorWithClass(this, PrimaryPositionGDPYearIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

