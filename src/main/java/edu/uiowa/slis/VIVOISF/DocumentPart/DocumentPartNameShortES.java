package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNameShortESIterator theDocumentPart = (DocumentPartNameShortESIterator)findAncestorWithClass(this, DocumentPartNameShortESIterator.class);
			pageContext.getOut().print(theDocumentPart.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

