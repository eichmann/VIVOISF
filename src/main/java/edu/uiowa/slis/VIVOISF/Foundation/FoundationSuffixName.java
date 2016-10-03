package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FoundationSuffixNameIterator theFoundation = (FoundationSuffixNameIterator)findAncestorWithClass(this, FoundationSuffixNameIterator.class);
			pageContext.getOut().print(theFoundation.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

