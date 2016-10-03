package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryEditorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryEditorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryEditorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryEditorInverseIterator theCoreLaboratoryEditorInverseIterator = (CoreLaboratoryEditorInverseIterator)findAncestorWithClass(this, CoreLaboratoryEditorInverseIterator.class);
			pageContext.getOut().print(theCoreLaboratoryEditorInverseIterator.getEditorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for editor tag ");
		}
		return SKIP_BODY;
	}
}

