package edu.uiowa.slis.VIVOISF.CoPrincipalInvestigatorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoPrincipalInvestigatorRoleSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoPrincipalInvestigatorRoleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CoPrincipalInvestigatorRoleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			CoPrincipalInvestigatorRole theCoPrincipalInvestigatorRole = (CoPrincipalInvestigatorRole)findAncestorWithClass(this, CoPrincipalInvestigatorRole.class);
			if (!theCoPrincipalInvestigatorRole.commitNeeded) {
				pageContext.getOut().print(theCoPrincipalInvestigatorRole.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CoPrincipalInvestigatorRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoPrincipalInvestigatorRole for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			CoPrincipalInvestigatorRole theCoPrincipalInvestigatorRole = (CoPrincipalInvestigatorRole)findAncestorWithClass(this, CoPrincipalInvestigatorRole.class);
			return theCoPrincipalInvestigatorRole.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing CoPrincipalInvestigatorRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoPrincipalInvestigatorRole for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			CoPrincipalInvestigatorRole theCoPrincipalInvestigatorRole = (CoPrincipalInvestigatorRole)findAncestorWithClass(this, CoPrincipalInvestigatorRole.class);
			theCoPrincipalInvestigatorRole.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing CoPrincipalInvestigatorRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoPrincipalInvestigatorRole for subjectURI tag ");
		}
	}
}

