package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramSubcontractsGrant extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramSubcontractsGrant currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramSubcontractsGrant.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramSubcontractsGrantIterator theProgramSubcontractsGrantIterator = (ProgramSubcontractsGrantIterator)findAncestorWithClass(this, ProgramSubcontractsGrantIterator.class);
			pageContext.getOut().print(theProgramSubcontractsGrantIterator.getSubcontractsGrant());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}

