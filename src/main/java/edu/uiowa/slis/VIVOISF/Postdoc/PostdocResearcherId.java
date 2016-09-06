package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocResearcherId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocResearcherId currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocResearcherId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocResearcherIdIterator thePostdoc = (PostdocResearcherIdIterator)findAncestorWithClass(this, PostdocResearcherIdIterator.class);
			pageContext.getOut().print(thePostdoc.getResearcherId());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for researcherId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for researcherId tag ");
		}
		return SKIP_BODY;
	}
}

