package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentCodeGAULIterator theDocument = (DocumentCodeGAULIterator)findAncestorWithClass(this, DocumentCodeGAULIterator.class);
			pageContext.getOut().print(theDocument.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

