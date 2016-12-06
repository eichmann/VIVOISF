package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionNameListRUIterator thePrimaryPosition = (PrimaryPositionNameListRUIterator)findAncestorWithClass(this, PrimaryPositionNameListRUIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

