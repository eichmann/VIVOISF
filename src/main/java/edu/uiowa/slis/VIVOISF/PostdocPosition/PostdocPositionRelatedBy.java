package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionRelatedByIterator thePostdocPositionRelatedByIterator = (PostdocPositionRelatedByIterator)findAncestorWithClass(this, PostdocPositionRelatedByIterator.class);
			pageContext.getOut().print(thePostdocPositionRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

