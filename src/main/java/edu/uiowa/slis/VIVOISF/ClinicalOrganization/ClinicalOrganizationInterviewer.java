package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationInterviewer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationInterviewer currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationInterviewer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationInterviewerIterator theClinicalOrganizationInterviewerIterator = (ClinicalOrganizationInterviewerIterator)findAncestorWithClass(this, ClinicalOrganizationInterviewerIterator.class);
			pageContext.getOut().print(theClinicalOrganizationInterviewerIterator.getInterviewer());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

