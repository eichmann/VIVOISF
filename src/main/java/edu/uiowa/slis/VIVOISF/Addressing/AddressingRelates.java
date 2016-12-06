package edu.uiowa.slis.VIVOISF.Addressing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AddressingRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AddressingRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(AddressingRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AddressingRelatesIterator theAddressingRelatesIterator = (AddressingRelatesIterator)findAncestorWithClass(this, AddressingRelatesIterator.class);
			pageContext.getOut().print(theAddressingRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing Addressing for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Addressing for relates tag ");
		}
		return SKIP_BODY;
	}
}

