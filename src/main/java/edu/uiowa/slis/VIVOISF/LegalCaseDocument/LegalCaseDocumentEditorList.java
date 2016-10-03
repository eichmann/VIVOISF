package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentEditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentEditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentEditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentEditorListIterator theLegalCaseDocumentEditorListIterator = (LegalCaseDocumentEditorListIterator)findAncestorWithClass(this, LegalCaseDocumentEditorListIterator.class);
			pageContext.getOut().print(theLegalCaseDocumentEditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for editorList tag ");
		}
		return SKIP_BODY;
	}
}

