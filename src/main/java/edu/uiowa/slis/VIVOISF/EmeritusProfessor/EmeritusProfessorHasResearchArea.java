package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorHasResearchAreaIterator theEmeritusProfessorHasResearchAreaIterator = (EmeritusProfessorHasResearchAreaIterator)findAncestorWithClass(this, EmeritusProfessorHasResearchAreaIterator.class);
			pageContext.getOut().print(theEmeritusProfessorHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

