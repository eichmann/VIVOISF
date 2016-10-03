package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPrefixNameIterator thePostdoc = (PostdocPrefixNameIterator)findAncestorWithClass(this, PostdocPrefixNameIterator.class);
			pageContext.getOut().print(thePostdoc.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

