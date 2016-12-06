package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNameListITIterator thePosition = (PositionNameListITIterator)findAncestorWithClass(this, PositionNameListITIterator.class);
			pageContext.getOut().print(thePosition.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

