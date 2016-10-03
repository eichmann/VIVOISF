package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocDirectorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocDirectorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocDirectorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocDirectorInverseIterator thePostdocDirectorInverseIterator = (PostdocDirectorInverseIterator)findAncestorWithClass(this, PostdocDirectorInverseIterator.class);
			pageContext.getOut().print(thePostdocDirectorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for director tag ");
		}
		return SKIP_BODY;
	}
}

