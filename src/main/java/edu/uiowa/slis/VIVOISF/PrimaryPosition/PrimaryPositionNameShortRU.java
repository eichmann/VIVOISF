package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionNameShortRUIterator thePrimaryPosition = (PrimaryPositionNameShortRUIterator)findAncestorWithClass(this, PrimaryPositionNameShortRUIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

