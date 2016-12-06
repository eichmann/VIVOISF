package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNameListESIterator theDocumentPart = (DocumentPartNameListESIterator)findAncestorWithClass(this, DocumentPartNameListESIterator.class);
			pageContext.getOut().print(theDocumentPart.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

