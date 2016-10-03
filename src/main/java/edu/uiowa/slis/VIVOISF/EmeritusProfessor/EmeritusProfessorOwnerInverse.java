package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorOwnerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorOwnerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorOwnerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorOwnerInverseIterator theEmeritusProfessorOwnerInverseIterator = (EmeritusProfessorOwnerInverseIterator)findAncestorWithClass(this, EmeritusProfessorOwnerInverseIterator.class);
			pageContext.getOut().print(theEmeritusProfessorOwnerInverseIterator.getOwnerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for owner tag ");
		}
		return SKIP_BODY;
	}
}

