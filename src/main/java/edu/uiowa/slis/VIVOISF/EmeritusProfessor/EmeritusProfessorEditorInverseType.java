package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorEditorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorEditorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorEditorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorEditorInverseIterator theEmeritusProfessorEditorInverseIterator = (EmeritusProfessorEditorInverseIterator)findAncestorWithClass(this, EmeritusProfessorEditorInverseIterator.class);
			pageContext.getOut().print(theEmeritusProfessorEditorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for editor tag ");
		}
		return SKIP_BODY;
	}
}

