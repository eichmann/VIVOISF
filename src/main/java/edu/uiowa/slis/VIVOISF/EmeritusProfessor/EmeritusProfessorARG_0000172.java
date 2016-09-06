package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorARG_0000172 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorARG_0000172 currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorARG_0000172.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorARG_0000172Iterator theEmeritusProfessor = (EmeritusProfessorARG_0000172Iterator)findAncestorWithClass(this, EmeritusProfessorARG_0000172Iterator.class);
			pageContext.getOut().print(theEmeritusProfessor.getARG_0000172());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for ARG_0000172 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for ARG_0000172 tag ");
		}
		return SKIP_BODY;
	}
}

