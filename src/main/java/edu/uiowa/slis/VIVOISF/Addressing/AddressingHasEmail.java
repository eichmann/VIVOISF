package edu.uiowa.slis.VIVOISF.Addressing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AddressingHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AddressingHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(AddressingHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AddressingHasEmailIterator theAddressingHasEmailIterator = (AddressingHasEmailIterator)findAncestorWithClass(this, AddressingHasEmailIterator.class);
			pageContext.getOut().print(theAddressingHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing Addressing for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Addressing for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

