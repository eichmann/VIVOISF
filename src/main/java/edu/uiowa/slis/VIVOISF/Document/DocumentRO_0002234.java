package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentRO_0002234 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentRO_0002234 currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentRO_0002234.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentRO_0002234Iterator theDocumentRO_0002234Iterator = (DocumentRO_0002234Iterator)findAncestorWithClass(this, DocumentRO_0002234Iterator.class);
			pageContext.getOut().print(theDocumentRO_0002234Iterator.getRO_0002234());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

