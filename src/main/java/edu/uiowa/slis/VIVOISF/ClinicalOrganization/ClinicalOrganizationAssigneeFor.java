package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationAssigneeFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationAssigneeFor currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationAssigneeFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationAssigneeForIterator theClinicalOrganizationAssigneeForIterator = (ClinicalOrganizationAssigneeForIterator)findAncestorWithClass(this, ClinicalOrganizationAssigneeForIterator.class);
			pageContext.getOut().print(theClinicalOrganizationAssigneeForIterator.getAssigneeFor());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

