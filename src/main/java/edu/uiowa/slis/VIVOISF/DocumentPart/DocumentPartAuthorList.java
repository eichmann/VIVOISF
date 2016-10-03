package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartAuthorListIterator theDocumentPartAuthorListIterator = (DocumentPartAuthorListIterator)findAncestorWithClass(this, DocumentPartAuthorListIterator.class);
			pageContext.getOut().print(theDocumentPartAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for authorList tag ");
		}
		return SKIP_BODY;
	}
}

