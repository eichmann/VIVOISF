package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNationalityFRIterator theDocumentPart = (DocumentPartNationalityFRIterator)findAncestorWithClass(this, DocumentPartNationalityFRIterator.class);
			pageContext.getOut().print(theDocumentPart.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

