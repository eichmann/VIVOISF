package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionNameShortFRIterator thePrimaryPosition = (PrimaryPositionNameShortFRIterator)findAncestorWithClass(this, PrimaryPositionNameShortFRIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

