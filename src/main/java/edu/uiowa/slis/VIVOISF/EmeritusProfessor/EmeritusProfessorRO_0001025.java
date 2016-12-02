package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorRO_0001025.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorRO_0001025Iterator theEmeritusProfessor = (EmeritusProfessorRO_0001025Iterator)findAncestorWithClass(this, EmeritusProfessorRO_0001025Iterator.class);
			pageContext.getOut().print(theEmeritusProfessor.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

