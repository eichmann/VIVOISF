package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNameOfficialARIterator theDocument = (DocumentNameOfficialARIterator)findAncestorWithClass(this, DocumentNameOfficialARIterator.class);
			pageContext.getOut().print(theDocument.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

