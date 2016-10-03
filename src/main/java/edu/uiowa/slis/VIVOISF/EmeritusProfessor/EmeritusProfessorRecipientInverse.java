package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorRecipientInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorRecipientInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorRecipientInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorRecipientInverseIterator theEmeritusProfessorRecipientInverseIterator = (EmeritusProfessorRecipientInverseIterator)findAncestorWithClass(this, EmeritusProfessorRecipientInverseIterator.class);
			pageContext.getOut().print(theEmeritusProfessorRecipientInverseIterator.getRecipientInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for recipient tag ");
		}
		return SKIP_BODY;
	}
}

