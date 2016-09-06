package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentARG_0000001Iterator theLegalDocument = (LegalDocumentARG_0000001Iterator)findAncestorWithClass(this, LegalDocumentARG_0000001Iterator.class);
			pageContext.getOut().print(theLegalDocument.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

