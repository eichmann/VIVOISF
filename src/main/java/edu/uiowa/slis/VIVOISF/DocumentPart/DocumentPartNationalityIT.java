package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNationalityITIterator theDocumentPart = (DocumentPartNationalityITIterator)findAncestorWithClass(this, DocumentPartNationalityITIterator.class);
			pageContext.getOut().print(theDocumentPart.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

