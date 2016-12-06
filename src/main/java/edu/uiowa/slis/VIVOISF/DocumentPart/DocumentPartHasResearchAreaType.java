package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartHasResearchAreaIterator theDocumentPartHasResearchAreaIterator = (DocumentPartHasResearchAreaIterator)findAncestorWithClass(this, DocumentPartHasResearchAreaIterator.class);
			pageContext.getOut().print(theDocumentPartHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

