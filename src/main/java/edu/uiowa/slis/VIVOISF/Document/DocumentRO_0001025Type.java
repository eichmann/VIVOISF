package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentRO_0001025Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentRO_0001025Type currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentRO_0001025Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentRO_0001025Iterator theDocumentRO_0001025Iterator = (DocumentRO_0001025Iterator)findAncestorWithClass(this, DocumentRO_0001025Iterator.class);
			pageContext.getOut().print(theDocumentRO_0001025Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}
