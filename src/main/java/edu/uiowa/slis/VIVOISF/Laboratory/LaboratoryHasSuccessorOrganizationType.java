package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryHasSuccessorOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryHasSuccessorOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryHasSuccessorOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryHasSuccessorOrganizationIterator theLaboratoryHasSuccessorOrganizationIterator = (LaboratoryHasSuccessorOrganizationIterator)findAncestorWithClass(this, LaboratoryHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theLaboratoryHasSuccessorOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

