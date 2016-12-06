package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNationalityENIterator theDocument = (DocumentNationalityENIterator)findAncestorWithClass(this, DocumentNationalityENIterator.class);
			pageContext.getOut().print(theDocument.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

