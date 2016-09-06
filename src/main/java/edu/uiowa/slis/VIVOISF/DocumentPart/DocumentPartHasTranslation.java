package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartHasTranslationIterator theDocumentPartHasTranslationIterator = (DocumentPartHasTranslationIterator)findAncestorWithClass(this, DocumentPartHasTranslationIterator.class);
			pageContext.getOut().print(theDocumentPartHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

