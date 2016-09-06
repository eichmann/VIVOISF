package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentVolumeIterator theLegalDocument = (LegalDocumentVolumeIterator)findAncestorWithClass(this, LegalDocumentVolumeIterator.class);
			pageContext.getOut().print(theLegalDocument.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for volume tag ");
		}
		return SKIP_BODY;
	}
}

