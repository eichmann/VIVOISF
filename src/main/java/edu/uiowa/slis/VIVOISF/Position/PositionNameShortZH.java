package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNameShortZHIterator thePosition = (PositionNameShortZHIterator)findAncestorWithClass(this, PositionNameShortZHIterator.class);
			pageContext.getOut().print(thePosition.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

