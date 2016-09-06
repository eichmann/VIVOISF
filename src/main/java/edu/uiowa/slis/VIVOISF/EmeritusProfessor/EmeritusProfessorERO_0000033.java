package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorERO_0000033 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorERO_0000033 currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorERO_0000033.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorERO_0000033Iterator theEmeritusProfessorERO_0000033Iterator = (EmeritusProfessorERO_0000033Iterator)findAncestorWithClass(this, EmeritusProfessorERO_0000033Iterator.class);
			pageContext.getOut().print(theEmeritusProfessorERO_0000033Iterator.getERO_0000033());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for ERO_0000033 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for ERO_0000033 tag ");
		}
		return SKIP_BODY;
	}
}

