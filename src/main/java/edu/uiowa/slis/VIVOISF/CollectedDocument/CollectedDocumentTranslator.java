package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentTranslatorIterator theCollectedDocumentTranslatorIterator = (CollectedDocumentTranslatorIterator)findAncestorWithClass(this, CollectedDocumentTranslatorIterator.class);
			pageContext.getOut().print(theCollectedDocumentTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for translator tag ");
		}
		return SKIP_BODY;
	}
}

