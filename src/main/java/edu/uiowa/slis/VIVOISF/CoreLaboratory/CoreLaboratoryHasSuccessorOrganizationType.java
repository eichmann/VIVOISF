package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryHasSuccessorOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryHasSuccessorOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryHasSuccessorOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryHasSuccessorOrganizationIterator theCoreLaboratoryHasSuccessorOrganizationIterator = (CoreLaboratoryHasSuccessorOrganizationIterator)findAncestorWithClass(this, CoreLaboratoryHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theCoreLaboratoryHasSuccessorOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

