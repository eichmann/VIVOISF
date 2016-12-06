package edu.uiowa.slis.VIVOISF.BFO_0000020;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000020HasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000020HasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000020HasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000020HasAddressIterator theBFO_0000020HasAddressIterator = (BFO_0000020HasAddressIterator)findAncestorWithClass(this, BFO_0000020HasAddressIterator.class);
			pageContext.getOut().print(theBFO_0000020HasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000020 for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000020 for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

