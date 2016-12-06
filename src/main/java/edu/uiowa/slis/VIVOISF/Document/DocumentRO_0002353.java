package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentRO_0002353 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentRO_0002353 currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentRO_0002353.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentRO_0002353Iterator theDocumentRO_0002353Iterator = (DocumentRO_0002353Iterator)findAncestorWithClass(this, DocumentRO_0002353Iterator.class);
			pageContext.getOut().print(theDocumentRO_0002353Iterator.getRO_0002353());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

