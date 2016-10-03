package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentEditorIterator theLegalCaseDocumentEditorIterator = (LegalCaseDocumentEditorIterator)findAncestorWithClass(this, LegalCaseDocumentEditorIterator.class);
			pageContext.getOut().print(theLegalCaseDocumentEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for editor tag ");
		}
		return SKIP_BODY;
	}
}

