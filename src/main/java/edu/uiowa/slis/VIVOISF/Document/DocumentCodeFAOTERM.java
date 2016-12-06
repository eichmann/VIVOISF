package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentCodeFAOTERMIterator theDocument = (DocumentCodeFAOTERMIterator)findAncestorWithClass(this, DocumentCodeFAOTERMIterator.class);
			pageContext.getOut().print(theDocument.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

