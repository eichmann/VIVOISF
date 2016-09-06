package edu.uiowa.slis.VIVOISF.UndergraduateAdvisingRelationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateAdvisingRelationshipDegreeCandidacy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateAdvisingRelationshipDegreeCandidacy currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateAdvisingRelationshipDegreeCandidacy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateAdvisingRelationshipDegreeCandidacyIterator theUndergraduateAdvisingRelationshipDegreeCandidacyIterator = (UndergraduateAdvisingRelationshipDegreeCandidacyIterator)findAncestorWithClass(this, UndergraduateAdvisingRelationshipDegreeCandidacyIterator.class);
			pageContext.getOut().print(theUndergraduateAdvisingRelationshipDegreeCandidacyIterator.getDegreeCandidacy());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateAdvisingRelationship for degreeCandidacy tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateAdvisingRelationship for degreeCandidacy tag ");
		}
		return SKIP_BODY;
	}
}

