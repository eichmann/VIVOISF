package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNameShortFRIterator thePosition = (PositionNameShortFRIterator)findAncestorWithClass(this, PositionNameShortFRIterator.class);
			pageContext.getOut().print(thePosition.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

