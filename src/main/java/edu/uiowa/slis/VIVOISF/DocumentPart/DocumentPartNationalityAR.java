package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNationalityARIterator theDocumentPart = (DocumentPartNationalityARIterator)findAncestorWithClass(this, DocumentPartNationalityARIterator.class);
			pageContext.getOut().print(theDocumentPart.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

