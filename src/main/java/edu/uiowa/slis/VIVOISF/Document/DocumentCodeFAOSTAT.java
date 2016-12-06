package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentCodeFAOSTATIterator theDocument = (DocumentCodeFAOSTATIterator)findAncestorWithClass(this, DocumentCodeFAOSTATIterator.class);
			pageContext.getOut().print(theDocument.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

