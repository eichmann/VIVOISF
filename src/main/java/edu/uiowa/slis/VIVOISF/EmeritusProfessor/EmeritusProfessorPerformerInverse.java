package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorPerformerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorPerformerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorPerformerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorPerformerInverseIterator theEmeritusProfessorPerformerInverseIterator = (EmeritusProfessorPerformerInverseIterator)findAncestorWithClass(this, EmeritusProfessorPerformerInverseIterator.class);
			pageContext.getOut().print(theEmeritusProfessorPerformerInverseIterator.getPerformerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for performer tag ");
		}
		return SKIP_BODY;
	}
}

