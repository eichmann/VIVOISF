package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramOBI_0000304InverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramOBI_0000304InverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramOBI_0000304InverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramOBI_0000304InverseIterator theProgramOBI_0000304InverseIterator = (ProgramOBI_0000304InverseIterator)findAncestorWithClass(this, ProgramOBI_0000304InverseIterator.class);
			pageContext.getOut().print(theProgramOBI_0000304InverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for OBI_0000304 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for OBI_0000304 tag ");
		}
		return SKIP_BODY;
	}
}

