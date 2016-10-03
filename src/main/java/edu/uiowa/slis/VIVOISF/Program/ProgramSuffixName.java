package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProgramSuffixNameIterator theProgram = (ProgramSuffixNameIterator)findAncestorWithClass(this, ProgramSuffixNameIterator.class);
			pageContext.getOut().print(theProgram.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

