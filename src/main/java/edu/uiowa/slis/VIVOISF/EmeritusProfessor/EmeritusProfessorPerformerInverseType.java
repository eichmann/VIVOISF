package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorPerformerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorPerformerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorPerformerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorPerformerInverseIterator theEmeritusProfessorPerformerInverseIterator = (EmeritusProfessorPerformerInverseIterator)findAncestorWithClass(this, EmeritusProfessorPerformerInverseIterator.class);
			pageContext.getOut().print(theEmeritusProfessorPerformerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for performer tag ");
		}
		return SKIP_BODY;
	}
}

