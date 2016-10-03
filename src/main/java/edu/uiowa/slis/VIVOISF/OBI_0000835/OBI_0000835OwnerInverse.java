package edu.uiowa.slis.VIVOISF.OBI_0000835;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000835OwnerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000835OwnerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000835OwnerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000835OwnerInverseIterator theOBI_0000835OwnerInverseIterator = (OBI_0000835OwnerInverseIterator)findAncestorWithClass(this, OBI_0000835OwnerInverseIterator.class);
			pageContext.getOut().print(theOBI_0000835OwnerInverseIterator.getOwnerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000835 for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000835 for owner tag ");
		}
		return SKIP_BODY;
	}
}

