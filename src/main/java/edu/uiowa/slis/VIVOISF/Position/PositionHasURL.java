package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PositionHasURLIterator thePositionHasURLIterator = (PositionHasURLIterator)findAncestorWithClass(this, PositionHasURLIterator.class);
			pageContext.getOut().print(thePositionHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

