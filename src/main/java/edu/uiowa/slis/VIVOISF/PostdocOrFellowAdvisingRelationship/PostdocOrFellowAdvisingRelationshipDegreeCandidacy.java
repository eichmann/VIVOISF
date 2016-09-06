package edu.uiowa.slis.VIVOISF.PostdocOrFellowAdvisingRelationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocOrFellowAdvisingRelationshipDegreeCandidacy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocOrFellowAdvisingRelationshipDegreeCandidacy currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocOrFellowAdvisingRelationshipDegreeCandidacy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocOrFellowAdvisingRelationshipDegreeCandidacyIterator thePostdocOrFellowAdvisingRelationshipDegreeCandidacyIterator = (PostdocOrFellowAdvisingRelationshipDegreeCandidacyIterator)findAncestorWithClass(this, PostdocOrFellowAdvisingRelationshipDegreeCandidacyIterator.class);
			pageContext.getOut().print(thePostdocOrFellowAdvisingRelationshipDegreeCandidacyIterator.getDegreeCandidacy());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocOrFellowAdvisingRelationship for degreeCandidacy tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocOrFellowAdvisingRelationship for degreeCandidacy tag ");
		}
		return SKIP_BODY;
	}
}

