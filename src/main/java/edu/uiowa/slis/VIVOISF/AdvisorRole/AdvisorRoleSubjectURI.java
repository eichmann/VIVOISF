package edu.uiowa.slis.VIVOISF.AdvisorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AdvisorRoleSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AdvisorRoleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AdvisorRoleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AdvisorRole theAdvisorRole = (AdvisorRole)findAncestorWithClass(this, AdvisorRole.class);
			if (!theAdvisorRole.commitNeeded) {
				pageContext.getOut().print(theAdvisorRole.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AdvisorRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdvisorRole for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			AdvisorRole theAdvisorRole = (AdvisorRole)findAncestorWithClass(this, AdvisorRole.class);
			return theAdvisorRole.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing AdvisorRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdvisorRole for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			AdvisorRole theAdvisorRole = (AdvisorRole)findAncestorWithClass(this, AdvisorRole.class);
			theAdvisorRole.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing AdvisorRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdvisorRole for subjectURI tag ");
		}
	}
}

