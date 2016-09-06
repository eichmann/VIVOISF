package edu.uiowa.slis.VIVOISF.Addressing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AddressingUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AddressingUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(AddressingUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AddressingUrlIterator theAddressing = (AddressingUrlIterator)findAncestorWithClass(this, AddressingUrlIterator.class);
			pageContext.getOut().print(theAddressing.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Addressing for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Addressing for url tag ");
		}
		return SKIP_BODY;
	}
}

