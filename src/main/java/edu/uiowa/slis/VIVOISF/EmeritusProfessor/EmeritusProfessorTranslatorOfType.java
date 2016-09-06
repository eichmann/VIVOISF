package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorTranslatorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorTranslatorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorTranslatorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorTranslatorOfIterator theEmeritusProfessorTranslatorOfIterator = (EmeritusProfessorTranslatorOfIterator)findAncestorWithClass(this, EmeritusProfessorTranslatorOfIterator.class);
			pageContext.getOut().print(theEmeritusProfessorTranslatorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

