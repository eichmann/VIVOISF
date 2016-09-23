package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocSameAs extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocSameAs currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocSameAs.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocSameAsIterator thePostdoc = (PostdocSameAsIterator)findAncestorWithClass(this, PostdocSameAsIterator.class);
			pageContext.getOut().print(thePostdoc.getSameAs());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

