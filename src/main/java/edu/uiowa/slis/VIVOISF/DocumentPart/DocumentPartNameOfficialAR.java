package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNameOfficialARIterator theDocumentPart = (DocumentPartNameOfficialARIterator)findAncestorWithClass(this, DocumentPartNameOfficialARIterator.class);
			pageContext.getOut().print(theDocumentPart.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

