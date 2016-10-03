package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartSici currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartSiciIterator theDocumentPart = (DocumentPartSiciIterator)findAncestorWithClass(this, DocumentPartSiciIterator.class);
			pageContext.getOut().print(theDocumentPart.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for sici tag ");
		}
		return SKIP_BODY;
	}
}

