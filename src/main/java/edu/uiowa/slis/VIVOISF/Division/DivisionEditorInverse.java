package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionEditorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionEditorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionEditorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionEditorInverseIterator theDivisionEditorInverseIterator = (DivisionEditorInverseIterator)findAncestorWithClass(this, DivisionEditorInverseIterator.class);
			pageContext.getOut().print(theDivisionEditorInverseIterator.getEditorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for editor tag ");
		}
		return SKIP_BODY;
	}
}

