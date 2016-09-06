package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramHasSuccessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramHasSuccessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramHasSuccessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramHasSuccessorOrganizationIterator theProgramHasSuccessorOrganizationIterator = (ProgramHasSuccessorOrganizationIterator)findAncestorWithClass(this, ProgramHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theProgramHasSuccessorOrganizationIterator.getHasSuccessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

