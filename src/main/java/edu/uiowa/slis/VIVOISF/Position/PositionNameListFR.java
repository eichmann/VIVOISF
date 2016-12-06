package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNameListFRIterator thePosition = (PositionNameListFRIterator)findAncestorWithClass(this, PositionNameListFRIterator.class);
			pageContext.getOut().print(thePosition.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

