package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartHasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartHasTitleIterator theDocumentPartHasTitleIterator = (DocumentPartHasTitleIterator)findAncestorWithClass(this, DocumentPartHasTitleIterator.class);
			pageContext.getOut().print(theDocumentPartHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

