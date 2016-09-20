package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentERO_0000045Iterator theLegalDocument = (LegalDocumentERO_0000045Iterator)findAncestorWithClass(this, LegalDocumentERO_0000045Iterator.class);
			pageContext.getOut().print(theLegalDocument.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

