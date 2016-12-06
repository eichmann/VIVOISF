package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNameOfficialZHIterator theDocument = (DocumentNameOfficialZHIterator)findAncestorWithClass(this, DocumentNameOfficialZHIterator.class);
			pageContext.getOut().print(theDocument.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

