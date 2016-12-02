package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocOrcidId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocOrcidId currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocOrcidId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocOrcidIdIterator thePostdoc = (PostdocOrcidIdIterator)findAncestorWithClass(this, PostdocOrcidIdIterator.class);
			pageContext.getOut().print(thePostdoc.getOrcidId());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

