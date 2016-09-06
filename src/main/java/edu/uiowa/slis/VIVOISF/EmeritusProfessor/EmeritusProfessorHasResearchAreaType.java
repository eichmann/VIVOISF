package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorHasResearchAreaIterator theEmeritusProfessorHasResearchAreaIterator = (EmeritusProfessorHasResearchAreaIterator)findAncestorWithClass(this, EmeritusProfessorHasResearchAreaIterator.class);
			pageContext.getOut().print(theEmeritusProfessorHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

