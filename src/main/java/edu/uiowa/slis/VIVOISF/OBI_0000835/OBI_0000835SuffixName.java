package edu.uiowa.slis.VIVOISF.OBI_0000835;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000835SuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000835SuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000835SuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OBI_0000835SuffixNameIterator theOBI_0000835 = (OBI_0000835SuffixNameIterator)findAncestorWithClass(this, OBI_0000835SuffixNameIterator.class);
			pageContext.getOut().print(theOBI_0000835.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000835 for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000835 for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

