package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNameOfficialESIterator theDocument = (DocumentNameOfficialESIterator)findAncestorWithClass(this, DocumentNameOfficialESIterator.class);
			pageContext.getOut().print(theDocument.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

