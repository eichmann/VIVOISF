package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocRecipientInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocRecipientInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocRecipientInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocRecipientInverseIterator thePostdocRecipientInverseIterator = (PostdocRecipientInverseIterator)findAncestorWithClass(this, PostdocRecipientInverseIterator.class);
			pageContext.getOut().print(thePostdocRecipientInverseIterator.getRecipientInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for recipient tag ");
		}
		return SKIP_BODY;
	}
}

