package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocRelatedByIterator thePostdocRelatedByIterator = (PostdocRelatedByIterator)findAncestorWithClass(this, PostdocRelatedByIterator.class);
			pageContext.getOut().print(thePostdocRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

