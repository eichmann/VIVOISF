package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryHasPredecessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryHasPredecessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryHasPredecessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryHasPredecessorOrganizationIterator theLaboratoryHasPredecessorOrganizationIterator = (LaboratoryHasPredecessorOrganizationIterator)findAncestorWithClass(this, LaboratoryHasPredecessorOrganizationIterator.class);
			pageContext.getOut().print(theLaboratoryHasPredecessorOrganizationIterator.getHasPredecessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for hasPredecessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for hasPredecessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

