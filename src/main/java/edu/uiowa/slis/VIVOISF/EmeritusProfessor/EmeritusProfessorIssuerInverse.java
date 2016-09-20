package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorIssuerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorIssuerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorIssuerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorIssuerInverseIterator theEmeritusProfessorIssuerInverseIterator = (EmeritusProfessorIssuerInverseIterator)findAncestorWithClass(this, EmeritusProfessorIssuerInverseIterator.class);
			pageContext.getOut().print(theEmeritusProfessorIssuerInverseIterator.getIssuerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for issuer tag ");
		}
		return SKIP_BODY;
	}
}

