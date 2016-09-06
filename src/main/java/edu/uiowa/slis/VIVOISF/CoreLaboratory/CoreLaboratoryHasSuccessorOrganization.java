package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryHasSuccessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryHasSuccessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryHasSuccessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryHasSuccessorOrganizationIterator theCoreLaboratoryHasSuccessorOrganizationIterator = (CoreLaboratoryHasSuccessorOrganizationIterator)findAncestorWithClass(this, CoreLaboratoryHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theCoreLaboratoryHasSuccessorOrganizationIterator.getHasSuccessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

