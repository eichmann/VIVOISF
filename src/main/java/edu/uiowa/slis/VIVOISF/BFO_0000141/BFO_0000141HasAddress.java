package edu.uiowa.slis.VIVOISF.BFO_0000141;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000141HasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000141HasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000141HasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000141HasAddressIterator theBFO_0000141HasAddressIterator = (BFO_0000141HasAddressIterator)findAncestorWithClass(this, BFO_0000141HasAddressIterator.class);
			pageContext.getOut().print(theBFO_0000141HasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000141 for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000141 for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

