package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorScopusId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorScopusId currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorScopusId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorScopusIdIterator theEmeritusProfessor = (EmeritusProfessorScopusIdIterator)findAncestorWithClass(this, EmeritusProfessorScopusIdIterator.class);
			pageContext.getOut().print(theEmeritusProfessor.getScopusId());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for scopusId tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for scopusId tag ");
		}
		return SKIP_BODY;
	}
}

