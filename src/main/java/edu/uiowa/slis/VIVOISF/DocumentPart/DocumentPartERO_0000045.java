package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartERO_0000045Iterator theDocumentPart = (DocumentPartERO_0000045Iterator)findAncestorWithClass(this, DocumentPartERO_0000045Iterator.class);
			pageContext.getOut().print(theDocumentPart.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

