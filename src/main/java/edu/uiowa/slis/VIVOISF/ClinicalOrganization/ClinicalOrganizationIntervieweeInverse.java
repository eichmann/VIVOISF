package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationIntervieweeInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationIntervieweeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationIntervieweeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationIntervieweeInverseIterator theClinicalOrganizationIntervieweeInverseIterator = (ClinicalOrganizationIntervieweeInverseIterator)findAncestorWithClass(this, ClinicalOrganizationIntervieweeInverseIterator.class);
			pageContext.getOut().print(theClinicalOrganizationIntervieweeInverseIterator.getIntervieweeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

