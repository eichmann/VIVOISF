package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionHasAddressIterator thePrimaryPositionHasAddressIterator = (PrimaryPositionHasAddressIterator)findAncestorWithClass(this, PrimaryPositionHasAddressIterator.class);
			pageContext.getOut().print(thePrimaryPositionHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

