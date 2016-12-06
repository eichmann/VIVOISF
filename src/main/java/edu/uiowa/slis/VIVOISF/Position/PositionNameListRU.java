package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNameListRUIterator thePosition = (PositionNameListRUIterator)findAncestorWithClass(this, PositionNameListRUIterator.class);
			pageContext.getOut().print(thePosition.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

