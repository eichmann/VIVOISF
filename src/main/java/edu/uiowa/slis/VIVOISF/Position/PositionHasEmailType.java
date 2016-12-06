package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PositionHasEmailIterator thePositionHasEmailIterator = (PositionHasEmailIterator)findAncestorWithClass(this, PositionHasEmailIterator.class);
			pageContext.getOut().print(thePositionHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

