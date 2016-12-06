package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionLandAreaYearIterator thePosition = (PositionLandAreaYearIterator)findAncestorWithClass(this, PositionLandAreaYearIterator.class);
			pageContext.getOut().print(thePosition.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

