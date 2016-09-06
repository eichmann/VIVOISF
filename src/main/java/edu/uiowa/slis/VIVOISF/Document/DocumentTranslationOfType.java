package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentTranslationOfIterator theDocumentTranslationOfIterator = (DocumentTranslationOfIterator)findAncestorWithClass(this, DocumentTranslationOfIterator.class);
			pageContext.getOut().print(theDocumentTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

