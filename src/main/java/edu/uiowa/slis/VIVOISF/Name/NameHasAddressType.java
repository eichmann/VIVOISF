package edu.uiowa.slis.VIVOISF.Name;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NameHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NameHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(NameHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NameHasAddressIterator theNameHasAddressIterator = (NameHasAddressIterator)findAncestorWithClass(this, NameHasAddressIterator.class);
			pageContext.getOut().print(theNameHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Name for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Name for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

