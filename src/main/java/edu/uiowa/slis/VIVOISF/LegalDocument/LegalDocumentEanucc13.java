package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentEanucc13Iterator theLegalDocument = (LegalDocumentEanucc13Iterator)findAncestorWithClass(this, LegalDocumentEanucc13Iterator.class);
			pageContext.getOut().print(theLegalDocument.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

