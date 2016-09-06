package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentIAO_0000136Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentIAO_0000136Type currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentIAO_0000136Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentIAO_0000136Iterator theDocumentIAO_0000136Iterator = (DocumentIAO_0000136Iterator)findAncestorWithClass(this, DocumentIAO_0000136Iterator.class);
			pageContext.getOut().print(theDocumentIAO_0000136Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

