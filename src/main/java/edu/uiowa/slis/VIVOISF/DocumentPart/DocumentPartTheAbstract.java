package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartTheAbstractIterator theDocumentPart = (DocumentPartTheAbstractIterator)findAncestorWithClass(this, DocumentPartTheAbstractIterator.class);
			pageContext.getOut().print(theDocumentPart.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

