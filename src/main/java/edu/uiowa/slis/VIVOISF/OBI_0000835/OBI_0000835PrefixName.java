package edu.uiowa.slis.VIVOISF.OBI_0000835;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000835PrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000835PrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000835PrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OBI_0000835PrefixNameIterator theOBI_0000835 = (OBI_0000835PrefixNameIterator)findAncestorWithClass(this, OBI_0000835PrefixNameIterator.class);
			pageContext.getOut().print(theOBI_0000835.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000835 for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000835 for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

