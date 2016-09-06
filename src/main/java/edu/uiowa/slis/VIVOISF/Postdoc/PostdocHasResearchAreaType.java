package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocHasResearchAreaIterator thePostdocHasResearchAreaIterator = (PostdocHasResearchAreaIterator)findAncestorWithClass(this, PostdocHasResearchAreaIterator.class);
			pageContext.getOut().print(thePostdocHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

