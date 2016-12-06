package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionHasResearchAreaIterator thePostdocPositionHasResearchAreaIterator = (PostdocPositionHasResearchAreaIterator)findAncestorWithClass(this, PostdocPositionHasResearchAreaIterator.class);
			pageContext.getOut().print(thePostdocPositionHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

