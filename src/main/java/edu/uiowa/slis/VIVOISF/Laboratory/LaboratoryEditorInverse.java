package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryEditorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryEditorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryEditorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryEditorInverseIterator theLaboratoryEditorInverseIterator = (LaboratoryEditorInverseIterator)findAncestorWithClass(this, LaboratoryEditorInverseIterator.class);
			pageContext.getOut().print(theLaboratoryEditorInverseIterator.getEditorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for editor tag ");
		}
		return SKIP_BODY;
	}
}

