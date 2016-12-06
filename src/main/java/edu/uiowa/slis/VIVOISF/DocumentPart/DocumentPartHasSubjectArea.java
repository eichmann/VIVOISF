package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartHasSubjectArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartHasSubjectArea currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartHasSubjectArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartHasSubjectAreaIterator theDocumentPartHasSubjectAreaIterator = (DocumentPartHasSubjectAreaIterator)findAncestorWithClass(this, DocumentPartHasSubjectAreaIterator.class);
			pageContext.getOut().print(theDocumentPartHasSubjectAreaIterator.getHasSubjectArea());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

