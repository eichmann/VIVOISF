package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentEditorIterator theLegalDocumentEditorIterator = (LegalDocumentEditorIterator)findAncestorWithClass(this, LegalDocumentEditorIterator.class);
			pageContext.getOut().print(theLegalDocumentEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for editor tag ");
		}
		return SKIP_BODY;
	}
}

