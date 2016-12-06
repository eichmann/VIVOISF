package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentFreetextKeywordIterator theDocument = (DocumentFreetextKeywordIterator)findAncestorWithClass(this, DocumentFreetextKeywordIterator.class);
			pageContext.getOut().print(theDocument.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

