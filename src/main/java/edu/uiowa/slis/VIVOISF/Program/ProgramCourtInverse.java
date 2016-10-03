package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramCourtInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramCourtInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramCourtInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramCourtInverseIterator theProgramCourtInverseIterator = (ProgramCourtInverseIterator)findAncestorWithClass(this, ProgramCourtInverseIterator.class);
			pageContext.getOut().print(theProgramCourtInverseIterator.getCourtInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for court tag ");
		}
		return SKIP_BODY;
	}
}

