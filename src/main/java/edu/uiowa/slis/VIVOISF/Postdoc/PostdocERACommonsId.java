package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocERACommonsId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocERACommonsId currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocERACommonsId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocERACommonsIdIterator thePostdoc = (PostdocERACommonsIdIterator)findAncestorWithClass(this, PostdocERACommonsIdIterator.class);
			pageContext.getOut().print(thePostdoc.getERACommonsId());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for eRACommonsId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for eRACommonsId tag ");
		}
		return SKIP_BODY;
	}
}

