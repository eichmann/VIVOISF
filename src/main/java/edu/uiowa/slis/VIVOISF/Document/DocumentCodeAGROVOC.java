package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentCodeAGROVOCIterator theDocument = (DocumentCodeAGROVOCIterator)findAncestorWithClass(this, DocumentCodeAGROVOCIterator.class);
			pageContext.getOut().print(theDocument.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

