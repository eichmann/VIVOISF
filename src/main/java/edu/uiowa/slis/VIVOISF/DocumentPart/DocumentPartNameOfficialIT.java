package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNameOfficialITIterator theDocumentPart = (DocumentPartNameOfficialITIterator)findAncestorWithClass(this, DocumentPartNameOfficialITIterator.class);
			pageContext.getOut().print(theDocumentPart.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

