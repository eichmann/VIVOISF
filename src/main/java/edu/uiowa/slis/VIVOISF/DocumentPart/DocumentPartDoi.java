package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartDoiIterator theDocumentPart = (DocumentPartDoiIterator)findAncestorWithClass(this, DocumentPartDoiIterator.class);
			pageContext.getOut().print(theDocumentPart.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for doi tag ");
		}
		return SKIP_BODY;
	}
}

