package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionEditorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionEditorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionEditorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionEditorInverseIterator theDivisionEditorInverseIterator = (DivisionEditorInverseIterator)findAncestorWithClass(this, DivisionEditorInverseIterator.class);
			pageContext.getOut().print(theDivisionEditorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for editor tag ");
		}
		return SKIP_BODY;
	}
}

