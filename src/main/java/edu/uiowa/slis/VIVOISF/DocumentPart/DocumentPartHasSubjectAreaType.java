package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartHasSubjectAreaIterator theDocumentPartHasSubjectAreaIterator = (DocumentPartHasSubjectAreaIterator)findAncestorWithClass(this, DocumentPartHasSubjectAreaIterator.class);
			pageContext.getOut().print(theDocumentPartHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

