package edu.uiowa.slis.VIVOISF.Addressing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AddressingHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AddressingHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(AddressingHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AddressingHasAddressIterator theAddressingHasAddressIterator = (AddressingHasAddressIterator)findAncestorWithClass(this, AddressingHasAddressIterator.class);
			pageContext.getOut().print(theAddressingHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Addressing for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Addressing for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

