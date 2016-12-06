package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNameListZHIterator thePosition = (PositionNameListZHIterator)findAncestorWithClass(this, PositionNameListZHIterator.class);
			pageContext.getOut().print(thePosition.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

