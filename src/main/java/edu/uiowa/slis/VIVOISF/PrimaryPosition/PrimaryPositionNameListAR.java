package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionNameListARIterator thePrimaryPosition = (PrimaryPositionNameListARIterator)findAncestorWithClass(this, PrimaryPositionNameListARIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

