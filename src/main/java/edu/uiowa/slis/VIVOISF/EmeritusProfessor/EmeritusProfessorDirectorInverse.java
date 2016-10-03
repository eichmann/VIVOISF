package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorDirectorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorDirectorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorDirectorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorDirectorInverseIterator theEmeritusProfessorDirectorInverseIterator = (EmeritusProfessorDirectorInverseIterator)findAncestorWithClass(this, EmeritusProfessorDirectorInverseIterator.class);
			pageContext.getOut().print(theEmeritusProfessorDirectorInverseIterator.getDirectorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for director tag ");
		}
		return SKIP_BODY;
	}
}

