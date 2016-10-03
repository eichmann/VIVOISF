package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslationEditorListIterator theTranslationEditorListIterator = (TranslationEditorListIterator)findAncestorWithClass(this, TranslationEditorListIterator.class);
			pageContext.getOut().print(theTranslationEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for editorList tag ");
		}
		return SKIP_BODY;
	}
}

