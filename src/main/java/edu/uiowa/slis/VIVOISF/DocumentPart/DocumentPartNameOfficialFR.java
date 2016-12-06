package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNameOfficialFRIterator theDocumentPart = (DocumentPartNameOfficialFRIterator)findAncestorWithClass(this, DocumentPartNameOfficialFRIterator.class);
			pageContext.getOut().print(theDocumentPart.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

