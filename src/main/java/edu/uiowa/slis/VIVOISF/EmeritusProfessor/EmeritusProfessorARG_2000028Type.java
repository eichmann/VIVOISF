package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorARG_2000028Iterator theEmeritusProfessorARG_2000028Iterator = (EmeritusProfessorARG_2000028Iterator)findAncestorWithClass(this, EmeritusProfessorARG_2000028Iterator.class);
			pageContext.getOut().print(theEmeritusProfessorARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

