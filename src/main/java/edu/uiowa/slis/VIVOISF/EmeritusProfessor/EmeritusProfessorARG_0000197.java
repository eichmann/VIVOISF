package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorARG_0000197 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorARG_0000197 currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorARG_0000197.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorARG_0000197Iterator theEmeritusProfessor = (EmeritusProfessorARG_0000197Iterator)findAncestorWithClass(this, EmeritusProfessorARG_0000197Iterator.class);
			pageContext.getOut().print(theEmeritusProfessor.getARG_0000197());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for ARG_0000197 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for ARG_0000197 tag ");
		}
		return SKIP_BODY;
	}
}

