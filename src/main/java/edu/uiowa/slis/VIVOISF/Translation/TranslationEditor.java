package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslationEditorIterator theTranslationEditorIterator = (TranslationEditorIterator)findAncestorWithClass(this, TranslationEditorIterator.class);
			pageContext.getOut().print(theTranslationEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for editor tag ");
		}
		return SKIP_BODY;
	}
}

