package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramEditorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramEditorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramEditorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramEditorInverseIterator theProgramEditorInverseIterator = (ProgramEditorInverseIterator)findAncestorWithClass(this, ProgramEditorInverseIterator.class);
			pageContext.getOut().print(theProgramEditorInverseIterator.getEditorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for editor tag ");
		}
		return SKIP_BODY;
	}
}

