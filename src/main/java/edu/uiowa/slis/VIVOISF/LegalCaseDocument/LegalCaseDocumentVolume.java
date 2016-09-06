package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentVolumeIterator theLegalCaseDocument = (LegalCaseDocumentVolumeIterator)findAncestorWithClass(this, LegalCaseDocumentVolumeIterator.class);
			pageContext.getOut().print(theLegalCaseDocument.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for volume tag ");
		}
		return SKIP_BODY;
	}
}

