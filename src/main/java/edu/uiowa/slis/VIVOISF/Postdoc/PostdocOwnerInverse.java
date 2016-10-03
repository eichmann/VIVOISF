package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocOwnerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocOwnerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocOwnerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocOwnerInverseIterator thePostdocOwnerInverseIterator = (PostdocOwnerInverseIterator)findAncestorWithClass(this, PostdocOwnerInverseIterator.class);
			pageContext.getOut().print(thePostdocOwnerInverseIterator.getOwnerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for owner tag ");
		}
		return SKIP_BODY;
	}
}

