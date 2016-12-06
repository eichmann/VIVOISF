package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionLandAreaYearIterator thePrimaryPosition = (PrimaryPositionLandAreaYearIterator)findAncestorWithClass(this, PrimaryPositionLandAreaYearIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

