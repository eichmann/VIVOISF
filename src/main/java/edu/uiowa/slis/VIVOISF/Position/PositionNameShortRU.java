package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNameShortRUIterator thePosition = (PositionNameShortRUIterator)findAncestorWithClass(this, PositionNameShortRUIterator.class);
			pageContext.getOut().print(thePosition.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

