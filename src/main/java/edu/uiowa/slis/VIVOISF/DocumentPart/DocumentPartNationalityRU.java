package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNationalityRUIterator theDocumentPart = (DocumentPartNationalityRUIterator)findAncestorWithClass(this, DocumentPartNationalityRUIterator.class);
			pageContext.getOut().print(theDocumentPart.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

