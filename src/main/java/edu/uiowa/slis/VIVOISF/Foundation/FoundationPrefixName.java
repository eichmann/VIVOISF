package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FoundationPrefixNameIterator theFoundation = (FoundationPrefixNameIterator)findAncestorWithClass(this, FoundationPrefixNameIterator.class);
			pageContext.getOut().print(theFoundation.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

