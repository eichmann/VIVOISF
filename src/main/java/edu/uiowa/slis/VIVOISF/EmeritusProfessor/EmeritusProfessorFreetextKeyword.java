package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorFreetextKeywordIterator theEmeritusProfessor = (EmeritusProfessorFreetextKeywordIterator)findAncestorWithClass(this, EmeritusProfessorFreetextKeywordIterator.class);
			pageContext.getOut().print(theEmeritusProfessor.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

