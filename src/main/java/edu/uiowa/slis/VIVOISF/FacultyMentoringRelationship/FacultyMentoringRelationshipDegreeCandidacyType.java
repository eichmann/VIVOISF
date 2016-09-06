package edu.uiowa.slis.VIVOISF.FacultyMentoringRelationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMentoringRelationshipDegreeCandidacyType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMentoringRelationshipDegreeCandidacyType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMentoringRelationshipDegreeCandidacyType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyMentoringRelationshipDegreeCandidacyIterator theFacultyMentoringRelationshipDegreeCandidacyIterator = (FacultyMentoringRelationshipDegreeCandidacyIterator)findAncestorWithClass(this, FacultyMentoringRelationshipDegreeCandidacyIterator.class);
			pageContext.getOut().print(theFacultyMentoringRelationshipDegreeCandidacyIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMentoringRelationship for degreeCandidacy tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMentoringRelationship for degreeCandidacy tag ");
		}
		return SKIP_BODY;
	}
}

