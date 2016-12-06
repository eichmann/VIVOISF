package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNameOfficialENIterator theDocumentPart = (DocumentPartNameOfficialENIterator)findAncestorWithClass(this, DocumentPartNameOfficialENIterator.class);
			pageContext.getOut().print(theDocumentPart.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

