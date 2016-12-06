package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartCodeDBPediaIDIterator theDocumentPart = (DocumentPartCodeDBPediaIDIterator)findAncestorWithClass(this, DocumentPartCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theDocumentPart.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

