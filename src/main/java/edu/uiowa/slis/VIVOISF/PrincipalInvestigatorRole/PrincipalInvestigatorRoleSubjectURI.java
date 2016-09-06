package edu.uiowa.slis.VIVOISF.PrincipalInvestigatorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrincipalInvestigatorRoleSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrincipalInvestigatorRoleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PrincipalInvestigatorRoleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PrincipalInvestigatorRole thePrincipalInvestigatorRole = (PrincipalInvestigatorRole)findAncestorWithClass(this, PrincipalInvestigatorRole.class);
			if (!thePrincipalInvestigatorRole.commitNeeded) {
				pageContext.getOut().print(thePrincipalInvestigatorRole.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PrincipalInvestigatorRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrincipalInvestigatorRole for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			PrincipalInvestigatorRole thePrincipalInvestigatorRole = (PrincipalInvestigatorRole)findAncestorWithClass(this, PrincipalInvestigatorRole.class);
			return thePrincipalInvestigatorRole.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing PrincipalInvestigatorRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrincipalInvestigatorRole for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			PrincipalInvestigatorRole thePrincipalInvestigatorRole = (PrincipalInvestigatorRole)findAncestorWithClass(this, PrincipalInvestigatorRole.class);
			thePrincipalInvestigatorRole.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing PrincipalInvestigatorRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrincipalInvestigatorRole for subjectURI tag ");
		}
	}
}

