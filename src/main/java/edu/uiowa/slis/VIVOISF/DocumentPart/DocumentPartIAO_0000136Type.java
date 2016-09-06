package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartIAO_0000136Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartIAO_0000136Type currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartIAO_0000136Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartIAO_0000136Iterator theDocumentPartIAO_0000136Iterator = (DocumentPartIAO_0000136Iterator)findAncestorWithClass(this, DocumentPartIAO_0000136Iterator.class);
			pageContext.getOut().print(theDocumentPartIAO_0000136Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

