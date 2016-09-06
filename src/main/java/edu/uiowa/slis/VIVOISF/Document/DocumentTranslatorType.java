package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentTranslatorIterator theDocumentTranslatorIterator = (DocumentTranslatorIterator)findAncestorWithClass(this, DocumentTranslatorIterator.class);
			pageContext.getOut().print(theDocumentTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for translator tag ");
		}
		return SKIP_BODY;
	}
}

