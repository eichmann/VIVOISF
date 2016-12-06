package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartGDPUnitIterator theDocumentPart = (DocumentPartGDPUnitIterator)findAncestorWithClass(this, DocumentPartGDPUnitIterator.class);
			pageContext.getOut().print(theDocumentPart.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

