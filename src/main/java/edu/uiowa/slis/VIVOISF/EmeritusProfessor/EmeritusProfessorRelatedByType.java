package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorRelatedByIterator theEmeritusProfessorRelatedByIterator = (EmeritusProfessorRelatedByIterator)findAncestorWithClass(this, EmeritusProfessorRelatedByIterator.class);
			pageContext.getOut().print(theEmeritusProfessorRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

