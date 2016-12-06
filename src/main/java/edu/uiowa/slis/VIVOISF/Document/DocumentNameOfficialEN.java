package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNameOfficialENIterator theDocument = (DocumentNameOfficialENIterator)findAncestorWithClass(this, DocumentNameOfficialENIterator.class);
			pageContext.getOut().print(theDocument.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

