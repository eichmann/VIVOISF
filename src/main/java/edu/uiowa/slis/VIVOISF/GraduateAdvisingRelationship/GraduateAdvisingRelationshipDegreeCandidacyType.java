package edu.uiowa.slis.VIVOISF.GraduateAdvisingRelationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateAdvisingRelationshipDegreeCandidacyType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateAdvisingRelationshipDegreeCandidacyType currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateAdvisingRelationshipDegreeCandidacyType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GraduateAdvisingRelationshipDegreeCandidacyIterator theGraduateAdvisingRelationshipDegreeCandidacyIterator = (GraduateAdvisingRelationshipDegreeCandidacyIterator)findAncestorWithClass(this, GraduateAdvisingRelationshipDegreeCandidacyIterator.class);
			pageContext.getOut().print(theGraduateAdvisingRelationshipDegreeCandidacyIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateAdvisingRelationship for degreeCandidacy tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateAdvisingRelationship for degreeCandidacy tag ");
		}
		return SKIP_BODY;
	}
}

