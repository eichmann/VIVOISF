package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNameOfficialESIterator theDocumentPart = (DocumentPartNameOfficialESIterator)findAncestorWithClass(this, DocumentPartNameOfficialESIterator.class);
			pageContext.getOut().print(theDocumentPart.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

