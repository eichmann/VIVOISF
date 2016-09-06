package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentTranslatorIterator theDocumentTranslatorIterator = (DocumentTranslatorIterator)findAncestorWithClass(this, DocumentTranslatorIterator.class);
			pageContext.getOut().print(theDocumentTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for translator tag ");
		}
		return SKIP_BODY;
	}
}

