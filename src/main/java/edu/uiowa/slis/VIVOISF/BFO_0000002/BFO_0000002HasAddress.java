package edu.uiowa.slis.VIVOISF.BFO_0000002;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000002HasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000002HasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000002HasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000002HasAddressIterator theBFO_0000002HasAddressIterator = (BFO_0000002HasAddressIterator)findAncestorWithClass(this, BFO_0000002HasAddressIterator.class);
			pageContext.getOut().print(theBFO_0000002HasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000002 for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000002 for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

