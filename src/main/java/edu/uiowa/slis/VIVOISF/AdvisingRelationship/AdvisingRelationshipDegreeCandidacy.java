package edu.uiowa.slis.VIVOISF.AdvisingRelationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AdvisingRelationshipDegreeCandidacy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AdvisingRelationshipDegreeCandidacy currentInstance = null;
	private static final Log log = LogFactory.getLog(AdvisingRelationshipDegreeCandidacy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AdvisingRelationshipDegreeCandidacyIterator theAdvisingRelationshipDegreeCandidacyIterator = (AdvisingRelationshipDegreeCandidacyIterator)findAncestorWithClass(this, AdvisingRelationshipDegreeCandidacyIterator.class);
			pageContext.getOut().print(theAdvisingRelationshipDegreeCandidacyIterator.getDegreeCandidacy());
		} catch (Exception e) {
			log.error("Can't find enclosing AdvisingRelationship for degreeCandidacy tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdvisingRelationship for degreeCandidacy tag ");
		}
		return SKIP_BODY;
	}
}

