package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNameOfficialFRIterator theDocument = (DocumentNameOfficialFRIterator)findAncestorWithClass(this, DocumentNameOfficialFRIterator.class);
			pageContext.getOut().print(theDocument.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

