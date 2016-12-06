package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionHasURLIterator thePrimaryPositionHasURLIterator = (PrimaryPositionHasURLIterator)findAncestorWithClass(this, PrimaryPositionHasURLIterator.class);
			pageContext.getOut().print(thePrimaryPositionHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

