package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PositionHasAddressIterator thePositionHasAddressIterator = (PositionHasAddressIterator)findAncestorWithClass(this, PositionHasAddressIterator.class);
			pageContext.getOut().print(thePositionHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

