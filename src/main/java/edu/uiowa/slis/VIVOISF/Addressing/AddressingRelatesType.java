package edu.uiowa.slis.VIVOISF.Addressing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AddressingRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AddressingRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(AddressingRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AddressingRelatesIterator theAddressingRelatesIterator = (AddressingRelatesIterator)findAncestorWithClass(this, AddressingRelatesIterator.class);
			pageContext.getOut().print(theAddressingRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Addressing for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Addressing for relates tag ");
		}
		return SKIP_BODY;
	}
}

