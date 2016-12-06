package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentGDPUnitIterator theDocument = (DocumentGDPUnitIterator)findAncestorWithClass(this, DocumentGDPUnitIterator.class);
			pageContext.getOut().print(theDocument.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

