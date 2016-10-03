package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramEditorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramEditorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramEditorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramEditorInverseIterator theProgramEditorInverseIterator = (ProgramEditorInverseIterator)findAncestorWithClass(this, ProgramEditorInverseIterator.class);
			pageContext.getOut().print(theProgramEditorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for editor tag ");
		}
		return SKIP_BODY;
	}
}

