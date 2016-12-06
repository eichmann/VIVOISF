package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNameShortENIterator theDocumentPart = (DocumentPartNameShortENIterator)findAncestorWithClass(this, DocumentPartNameShortENIterator.class);
			pageContext.getOut().print(theDocumentPart.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

