package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionNameShortZHIterator thePrimaryPosition = (PrimaryPositionNameShortZHIterator)findAncestorWithClass(this, PrimaryPositionNameShortZHIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

