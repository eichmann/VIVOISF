package edu.uiowa.slis.VIVOISF.ClinicalRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalRoleSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalRoleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalRoleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalRole theClinicalRole = (ClinicalRole)findAncestorWithClass(this, ClinicalRole.class);
			if (!theClinicalRole.commitNeeded) {
				pageContext.getOut().print(theClinicalRole.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalRole for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ClinicalRole theClinicalRole = (ClinicalRole)findAncestorWithClass(this, ClinicalRole.class);
			return theClinicalRole.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ClinicalRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalRole for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ClinicalRole theClinicalRole = (ClinicalRole)findAncestorWithClass(this, ClinicalRole.class);
			theClinicalRole.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalRole for subjectURI tag ");
		}
	}
}

