package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNameShortESIterator thePosition = (PositionNameShortESIterator)findAncestorWithClass(this, PositionNameShortESIterator.class);
			pageContext.getOut().print(thePosition.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

