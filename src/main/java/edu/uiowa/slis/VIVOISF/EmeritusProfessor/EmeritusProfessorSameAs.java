package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorSameAs extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorSameAs currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorSameAs.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorSameAsIterator theEmeritusProfessor = (EmeritusProfessorSameAsIterator)findAncestorWithClass(this, EmeritusProfessorSameAsIterator.class);
			pageContext.getOut().print(theEmeritusProfessor.getSameAs());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

