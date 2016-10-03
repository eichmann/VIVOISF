package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorEditorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorEditorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorEditorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorEditorInverseIterator theEmeritusProfessorEditorInverseIterator = (EmeritusProfessorEditorInverseIterator)findAncestorWithClass(this, EmeritusProfessorEditorInverseIterator.class);
			pageContext.getOut().print(theEmeritusProfessorEditorInverseIterator.getEditorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for editor tag ");
		}
		return SKIP_BODY;
	}
}

