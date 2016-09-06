package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocScopusId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocScopusId currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocScopusId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocScopusIdIterator thePostdoc = (PostdocScopusIdIterator)findAncestorWithClass(this, PostdocScopusIdIterator.class);
			pageContext.getOut().print(thePostdoc.getScopusId());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for scopusId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for scopusId tag ");
		}
		return SKIP_BODY;
	}
}

