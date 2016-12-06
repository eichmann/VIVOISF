package edu.uiowa.slis.VIVOISF.BFO_0000001;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000001HasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000001HasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000001HasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000001HasAddressIterator theBFO_0000001HasAddressIterator = (BFO_0000001HasAddressIterator)findAncestorWithClass(this, BFO_0000001HasAddressIterator.class);
			pageContext.getOut().print(theBFO_0000001HasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000001 for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000001 for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

