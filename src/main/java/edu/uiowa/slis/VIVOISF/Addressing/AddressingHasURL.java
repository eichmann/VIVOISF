package edu.uiowa.slis.VIVOISF.Addressing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AddressingHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AddressingHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(AddressingHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AddressingHasURLIterator theAddressingHasURLIterator = (AddressingHasURLIterator)findAncestorWithClass(this, AddressingHasURLIterator.class);
			pageContext.getOut().print(theAddressingHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing Addressing for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Addressing for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

