package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNameListARIterator thePosition = (PositionNameListARIterator)findAncestorWithClass(this, PositionNameListARIterator.class);
			pageContext.getOut().print(thePosition.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

