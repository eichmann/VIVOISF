package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentEditorListIterator theLegalDocumentEditorListIterator = (LegalDocumentEditorListIterator)findAncestorWithClass(this, LegalDocumentEditorListIterator.class);
			pageContext.getOut().print(theLegalDocumentEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for editorList tag ");
		}
		return SKIP_BODY;
	}
}

