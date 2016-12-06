package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionAgriculturalAreaYearIterator thePrimaryPosition = (PrimaryPositionAgriculturalAreaYearIterator)findAncestorWithClass(this, PrimaryPositionAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

