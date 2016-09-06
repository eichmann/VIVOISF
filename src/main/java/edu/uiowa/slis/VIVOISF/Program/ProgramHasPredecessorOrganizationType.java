package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramHasPredecessorOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramHasPredecessorOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramHasPredecessorOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramHasPredecessorOrganizationIterator theProgramHasPredecessorOrganizationIterator = (ProgramHasPredecessorOrganizationIterator)findAncestorWithClass(this, ProgramHasPredecessorOrganizationIterator.class);
			pageContext.getOut().print(theProgramHasPredecessorOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for hasPredecessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for hasPredecessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

