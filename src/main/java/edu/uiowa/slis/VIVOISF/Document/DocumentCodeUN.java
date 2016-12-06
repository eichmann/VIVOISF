package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentCodeUNIterator theDocument = (DocumentCodeUNIterator)findAncestorWithClass(this, DocumentCodeUNIterator.class);
			pageContext.getOut().print(theDocument.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

