package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionNameListFRIterator thePrimaryPosition = (PrimaryPositionNameListFRIterator)findAncestorWithClass(this, PrimaryPositionNameListFRIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

