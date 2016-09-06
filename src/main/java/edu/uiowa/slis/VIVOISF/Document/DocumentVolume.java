package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentVolumeIterator theDocument = (DocumentVolumeIterator)findAncestorWithClass(this, DocumentVolumeIterator.class);
			pageContext.getOut().print(theDocument.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for volume tag ");
		}
		return SKIP_BODY;
	}
}

