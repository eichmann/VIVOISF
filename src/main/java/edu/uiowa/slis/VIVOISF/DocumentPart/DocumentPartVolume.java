package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartVolumeIterator theDocumentPart = (DocumentPartVolumeIterator)findAncestorWithClass(this, DocumentPartVolumeIterator.class);
			pageContext.getOut().print(theDocumentPart.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for volume tag ");
		}
		return SKIP_BODY;
	}
}

