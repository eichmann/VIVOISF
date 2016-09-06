package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryHasPredecessorOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryHasPredecessorOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryHasPredecessorOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryHasPredecessorOrganizationIterator theCoreLaboratoryHasPredecessorOrganizationIterator = (CoreLaboratoryHasPredecessorOrganizationIterator)findAncestorWithClass(this, CoreLaboratoryHasPredecessorOrganizationIterator.class);
			pageContext.getOut().print(theCoreLaboratoryHasPredecessorOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for hasPredecessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for hasPredecessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

