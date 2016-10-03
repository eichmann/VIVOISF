package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocOwnerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocOwnerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocOwnerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocOwnerInverseIterator thePostdocOwnerInverseIterator = (PostdocOwnerInverseIterator)findAncestorWithClass(this, PostdocOwnerInverseIterator.class);
			pageContext.getOut().print(thePostdocOwnerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for owner tag ");
		}
		return SKIP_BODY;
	}
}

