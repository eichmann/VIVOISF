package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationIntervieweeType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationIntervieweeType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationIntervieweeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationIntervieweeIterator theClinicalOrganizationIntervieweeIterator = (ClinicalOrganizationIntervieweeIterator)findAncestorWithClass(this, ClinicalOrganizationIntervieweeIterator.class);
			pageContext.getOut().print(theClinicalOrganizationIntervieweeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

