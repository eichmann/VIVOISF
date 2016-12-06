package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionHasNameIterator thePrimaryPositionHasNameIterator = (PrimaryPositionHasNameIterator)findAncestorWithClass(this, PrimaryPositionHasNameIterator.class);
			pageContext.getOut().print(thePrimaryPositionHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for hasName tag ");
		}
		return SKIP_BODY;
	}
}

