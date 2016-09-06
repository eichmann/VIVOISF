package edu.uiowa.slis.VIVOISF.AdvisingRelationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AdvisingRelationshipSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AdvisingRelationshipSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AdvisingRelationshipSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AdvisingRelationship theAdvisingRelationship = (AdvisingRelationship)findAncestorWithClass(this, AdvisingRelationship.class);
			if (!theAdvisingRelationship.commitNeeded) {
				pageContext.getOut().print(theAdvisingRelationship.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AdvisingRelationship for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdvisingRelationship for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			AdvisingRelationship theAdvisingRelationship = (AdvisingRelationship)findAncestorWithClass(this, AdvisingRelationship.class);
			return theAdvisingRelationship.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing AdvisingRelationship for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdvisingRelationship for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			AdvisingRelationship theAdvisingRelationship = (AdvisingRelationship)findAncestorWithClass(this, AdvisingRelationship.class);
			theAdvisingRelationship.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing AdvisingRelationship for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdvisingRelationship for subjectURI tag ");
		}
	}
}

