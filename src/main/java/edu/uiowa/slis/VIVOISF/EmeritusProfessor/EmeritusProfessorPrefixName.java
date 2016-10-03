package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorPrefixNameIterator theEmeritusProfessor = (EmeritusProfessorPrefixNameIterator)findAncestorWithClass(this, EmeritusProfessorPrefixNameIterator.class);
			pageContext.getOut().print(theEmeritusProfessor.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

