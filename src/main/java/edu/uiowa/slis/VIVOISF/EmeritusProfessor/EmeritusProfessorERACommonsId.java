package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorERACommonsId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorERACommonsId currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorERACommonsId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorERACommonsIdIterator theEmeritusProfessor = (EmeritusProfessorERACommonsIdIterator)findAncestorWithClass(this, EmeritusProfessorERACommonsIdIterator.class);
			pageContext.getOut().print(theEmeritusProfessor.getERACommonsId());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for eRACommonsId tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for eRACommonsId tag ");
		}
		return SKIP_BODY;
	}
}

