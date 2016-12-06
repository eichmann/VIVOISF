package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNationalityESIterator theDocumentPart = (DocumentPartNationalityESIterator)findAncestorWithClass(this, DocumentPartNationalityESIterator.class);
			pageContext.getOut().print(theDocumentPart.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

