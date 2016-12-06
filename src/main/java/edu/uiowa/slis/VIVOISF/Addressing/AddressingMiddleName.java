package edu.uiowa.slis.VIVOISF.Addressing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AddressingMiddleName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AddressingMiddleName currentInstance = null;
	private static final Log log = LogFactory.getLog(AddressingMiddleName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AddressingMiddleNameIterator theAddressing = (AddressingMiddleNameIterator)findAncestorWithClass(this, AddressingMiddleNameIterator.class);
			pageContext.getOut().print(theAddressing.getMiddleName());
		} catch (Exception e) {
			log.error("Can't find enclosing Addressing for middleName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Addressing for middleName tag ");
		}
		return SKIP_BODY;
	}
}

