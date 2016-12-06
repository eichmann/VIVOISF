package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNationalityRUIterator theDocument = (DocumentNationalityRUIterator)findAncestorWithClass(this, DocumentNationalityRUIterator.class);
			pageContext.getOut().print(theDocument.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

