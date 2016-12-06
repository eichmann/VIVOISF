package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionNameListESIterator thePrimaryPosition = (PrimaryPositionNameListESIterator)findAncestorWithClass(this, PrimaryPositionNameListESIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

