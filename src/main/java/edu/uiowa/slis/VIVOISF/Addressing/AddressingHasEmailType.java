package edu.uiowa.slis.VIVOISF.Addressing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AddressingHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AddressingHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(AddressingHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AddressingHasEmailIterator theAddressingHasEmailIterator = (AddressingHasEmailIterator)findAncestorWithClass(this, AddressingHasEmailIterator.class);
			pageContext.getOut().print(theAddressingHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Addressing for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Addressing for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

