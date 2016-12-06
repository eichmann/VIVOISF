package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNameOfficialZHIterator theDocumentPart = (DocumentPartNameOfficialZHIterator)findAncestorWithClass(this, DocumentPartNameOfficialZHIterator.class);
			pageContext.getOut().print(theDocumentPart.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

