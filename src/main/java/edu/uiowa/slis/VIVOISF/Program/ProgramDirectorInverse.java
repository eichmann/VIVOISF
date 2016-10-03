package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramDirectorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramDirectorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramDirectorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramDirectorInverseIterator theProgramDirectorInverseIterator = (ProgramDirectorInverseIterator)findAncestorWithClass(this, ProgramDirectorInverseIterator.class);
			pageContext.getOut().print(theProgramDirectorInverseIterator.getDirectorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for director tag ");
		}
		return SKIP_BODY;
	}
}

