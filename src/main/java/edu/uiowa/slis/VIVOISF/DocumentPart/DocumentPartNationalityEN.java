package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNationalityENIterator theDocumentPart = (DocumentPartNationalityENIterator)findAncestorWithClass(this, DocumentPartNationalityENIterator.class);
			pageContext.getOut().print(theDocumentPart.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

