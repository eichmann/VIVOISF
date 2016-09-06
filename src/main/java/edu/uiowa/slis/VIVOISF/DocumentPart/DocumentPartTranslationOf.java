package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartTranslationOfIterator theDocumentPartTranslationOfIterator = (DocumentPartTranslationOfIterator)findAncestorWithClass(this, DocumentPartTranslationOfIterator.class);
			pageContext.getOut().print(theDocumentPartTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

