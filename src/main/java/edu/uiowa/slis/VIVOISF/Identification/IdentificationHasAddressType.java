package edu.uiowa.slis.VIVOISF.Identification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IdentificationHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IdentificationHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(IdentificationHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IdentificationHasAddressIterator theIdentificationHasAddressIterator = (IdentificationHasAddressIterator)findAncestorWithClass(this, IdentificationHasAddressIterator.class);
			pageContext.getOut().print(theIdentificationHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Identification for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Identification for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

