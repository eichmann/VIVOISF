package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionNameShortESIterator thePrimaryPosition = (PrimaryPositionNameShortESIterator)findAncestorWithClass(this, PrimaryPositionNameShortESIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

