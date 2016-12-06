package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentCodeDBPediaIDIterator theDocument = (DocumentCodeDBPediaIDIterator)findAncestorWithClass(this, DocumentCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theDocument.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

