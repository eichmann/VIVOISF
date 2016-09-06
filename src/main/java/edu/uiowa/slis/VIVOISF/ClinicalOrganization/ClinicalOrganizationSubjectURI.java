package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganization theClinicalOrganization = (ClinicalOrganization)findAncestorWithClass(this, ClinicalOrganization.class);
			if (!theClinicalOrganization.commitNeeded) {
				pageContext.getOut().print(theClinicalOrganization.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ClinicalOrganization theClinicalOrganization = (ClinicalOrganization)findAncestorWithClass(this, ClinicalOrganization.class);
			return theClinicalOrganization.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ClinicalOrganization for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ClinicalOrganization theClinicalOrganization = (ClinicalOrganization)findAncestorWithClass(this, ClinicalOrganization.class);
			theClinicalOrganization.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for subjectURI tag ");
		}
	}
}

