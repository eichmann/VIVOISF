package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentRO_0000056Iterator theLegalCaseDocumentRO_0000056Iterator = (LegalCaseDocumentRO_0000056Iterator)findAncestorWithClass(this, LegalCaseDocumentRO_0000056Iterator.class);
			pageContext.getOut().print(theLegalCaseDocumentRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

