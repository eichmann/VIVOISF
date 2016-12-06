package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionNameShortARIterator thePrimaryPosition = (PrimaryPositionNameShortARIterator)findAncestorWithClass(this, PrimaryPositionNameShortARIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

