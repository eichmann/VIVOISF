package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentIAO_0000136Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentIAO_0000136Type currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentIAO_0000136Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentIAO_0000136Iterator theLegalDocumentIAO_0000136Iterator = (LegalDocumentIAO_0000136Iterator)findAncestorWithClass(this, LegalDocumentIAO_0000136Iterator.class);
			pageContext.getOut().print(theLegalDocumentIAO_0000136Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

