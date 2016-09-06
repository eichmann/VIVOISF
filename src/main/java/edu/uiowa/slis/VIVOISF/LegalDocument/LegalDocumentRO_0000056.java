package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentRO_0000056Iterator theLegalDocumentRO_0000056Iterator = (LegalDocumentRO_0000056Iterator)findAncestorWithClass(this, LegalDocumentRO_0000056Iterator.class);
			pageContext.getOut().print(theLegalDocumentRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

