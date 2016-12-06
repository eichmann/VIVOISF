package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNameListENIterator theDocumentPart = (DocumentPartNameListENIterator)findAncestorWithClass(this, DocumentPartNameListENIterator.class);
			pageContext.getOut().print(theDocumentPart.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

