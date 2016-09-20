package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorERO_0000397 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorERO_0000397 currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorERO_0000397.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorERO_0000397Iterator theEmeritusProfessorERO_0000397Iterator = (EmeritusProfessorERO_0000397Iterator)findAncestorWithClass(this, EmeritusProfessorERO_0000397Iterator.class);
			pageContext.getOut().print(theEmeritusProfessorERO_0000397Iterator.getERO_0000397());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for ERO_0000397 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for ERO_0000397 tag ");
		}
		return SKIP_BODY;
	}
}

