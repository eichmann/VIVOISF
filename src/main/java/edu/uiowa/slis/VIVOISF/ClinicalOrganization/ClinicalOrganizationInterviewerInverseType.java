package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationInterviewerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationInterviewerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationInterviewerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationInterviewerInverseIterator theClinicalOrganizationInterviewerInverseIterator = (ClinicalOrganizationInterviewerInverseIterator)findAncestorWithClass(this, ClinicalOrganizationInterviewerInverseIterator.class);
			pageContext.getOut().print(theClinicalOrganizationInterviewerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

