package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNameListESIterator thePosition = (PositionNameListESIterator)findAncestorWithClass(this, PositionNameListESIterator.class);
			pageContext.getOut().print(thePosition.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

