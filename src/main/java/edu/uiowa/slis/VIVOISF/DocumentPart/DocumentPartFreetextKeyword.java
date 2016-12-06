package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartFreetextKeywordIterator theDocumentPart = (DocumentPartFreetextKeywordIterator)findAncestorWithClass(this, DocumentPartFreetextKeywordIterator.class);
			pageContext.getOut().print(theDocumentPart.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

