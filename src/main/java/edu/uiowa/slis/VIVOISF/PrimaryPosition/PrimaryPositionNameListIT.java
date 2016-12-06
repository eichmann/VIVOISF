package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionNameListITIterator thePrimaryPosition = (PrimaryPositionNameListITIterator)findAncestorWithClass(this, PrimaryPositionNameListITIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

