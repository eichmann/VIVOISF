package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentHasTranslationIterator theDocumentHasTranslationIterator = (DocumentHasTranslationIterator)findAncestorWithClass(this, DocumentHasTranslationIterator.class);
			pageContext.getOut().print(theDocumentHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

