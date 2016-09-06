package edu.uiowa.slis.VIVOISF.Address;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AddressUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AddressUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(AddressUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AddressUrlIterator theAddress = (AddressUrlIterator)findAncestorWithClass(this, AddressUrlIterator.class);
			pageContext.getOut().print(theAddress.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Address for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Address for url tag ");
		}
		return SKIP_BODY;
	}
}

