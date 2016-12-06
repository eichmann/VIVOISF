package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionAgriculturalAreaYearIterator thePosition = (PositionAgriculturalAreaYearIterator)findAncestorWithClass(this, PositionAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(thePosition.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

