package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PositionHasNameIterator thePositionHasNameIterator = (PositionHasNameIterator)findAncestorWithClass(this, PositionHasNameIterator.class);
			pageContext.getOut().print(thePositionHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for hasName tag ");
		}
		return SKIP_BODY;
	}
}

