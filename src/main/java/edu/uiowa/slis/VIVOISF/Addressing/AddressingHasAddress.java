package edu.uiowa.slis.VIVOISF.Addressing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AddressingHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AddressingHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(AddressingHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AddressingHasAddressIterator theAddressingHasAddressIterator = (AddressingHasAddressIterator)findAncestorWithClass(this, AddressingHasAddressIterator.class);
			pageContext.getOut().print(theAddressingHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing Addressing for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Addressing for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

