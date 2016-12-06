package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionGDPYearIterator thePosition = (PositionGDPYearIterator)findAncestorWithClass(this, PositionGDPYearIterator.class);
			pageContext.getOut().print(thePosition.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

