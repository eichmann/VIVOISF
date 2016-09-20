package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramAffiliatedOrganizationInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramAffiliatedOrganizationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramAffiliatedOrganizationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramAffiliatedOrganizationInverseIterator theProgramAffiliatedOrganizationInverseIterator = (ProgramAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, ProgramAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(theProgramAffiliatedOrganizationInverseIterator.getAffiliatedOrganizationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

