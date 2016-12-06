package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentBFO_0000050 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentBFO_0000050 currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentBFO_0000050.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentBFO_0000050Iterator theDocumentBFO_0000050Iterator = (DocumentBFO_0000050Iterator)findAncestorWithClass(this, DocumentBFO_0000050Iterator.class);
			pageContext.getOut().print(theDocumentBFO_0000050Iterator.getBFO_0000050());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}
