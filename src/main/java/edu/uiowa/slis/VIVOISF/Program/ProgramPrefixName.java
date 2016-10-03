package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProgramPrefixNameIterator theProgram = (ProgramPrefixNameIterator)findAncestorWithClass(this, ProgramPrefixNameIterator.class);
			pageContext.getOut().print(theProgram.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

