package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocDirectorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocDirectorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocDirectorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocDirectorInverseIterator thePostdocDirectorInverseIterator = (PostdocDirectorInverseIterator)findAncestorWithClass(this, PostdocDirectorInverseIterator.class);
			pageContext.getOut().print(thePostdocDirectorInverseIterator.getDirectorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for director tag ");
		}
		return SKIP_BODY;
	}
}

