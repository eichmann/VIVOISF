package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionNameListZHIterator thePrimaryPosition = (PrimaryPositionNameListZHIterator)findAncestorWithClass(this, PrimaryPositionNameListZHIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

