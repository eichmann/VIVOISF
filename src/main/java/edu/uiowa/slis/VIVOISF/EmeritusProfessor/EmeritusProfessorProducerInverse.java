package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorProducerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorProducerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorProducerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorProducerInverseIterator theEmeritusProfessorProducerInverseIterator = (EmeritusProfessorProducerInverseIterator)findAncestorWithClass(this, EmeritusProfessorProducerInverseIterator.class);
			pageContext.getOut().print(theEmeritusProfessorProducerInverseIterator.getProducerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for producer tag ");
		}
		return SKIP_BODY;
	}
}

