package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionHrJobTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionHrJobTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionHrJobTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionHrJobTitleIterator thePosition = (PositionHrJobTitleIterator)findAncestorWithClass(this, PositionHrJobTitleIterator.class);
			pageContext.getOut().print(thePosition.getHrJobTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for hrJobTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for hrJobTitle tag ");
		}
		return SKIP_BODY;
	}
}

