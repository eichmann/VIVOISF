package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorSuffixNameIterator theEmeritusProfessor = (EmeritusProfessorSuffixNameIterator)findAncestorWithClass(this, EmeritusProfessorSuffixNameIterator.class);
			pageContext.getOut().print(theEmeritusProfessor.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

