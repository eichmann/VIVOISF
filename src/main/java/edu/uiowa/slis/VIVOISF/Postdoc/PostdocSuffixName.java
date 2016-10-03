package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocSuffixNameIterator thePostdoc = (PostdocSuffixNameIterator)findAncestorWithClass(this, PostdocSuffixNameIterator.class);
			pageContext.getOut().print(thePostdoc.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

