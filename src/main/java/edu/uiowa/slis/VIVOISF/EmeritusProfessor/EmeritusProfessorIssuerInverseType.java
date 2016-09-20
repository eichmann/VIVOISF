package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorIssuerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorIssuerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorIssuerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorIssuerInverseIterator theEmeritusProfessorIssuerInverseIterator = (EmeritusProfessorIssuerInverseIterator)findAncestorWithClass(this, EmeritusProfessorIssuerInverseIterator.class);
			pageContext.getOut().print(theEmeritusProfessorIssuerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for issuer tag ");
		}
		return SKIP_BODY;
	}
}

