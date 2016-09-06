package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocOrcidIdType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocOrcidIdType currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocOrcidIdType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocOrcidIdIterator thePostdocOrcidIdIterator = (PostdocOrcidIdIterator)findAncestorWithClass(this, PostdocOrcidIdIterator.class);
			pageContext.getOut().print(thePostdocOrcidIdIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

