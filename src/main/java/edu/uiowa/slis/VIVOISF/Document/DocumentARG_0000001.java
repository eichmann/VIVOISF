package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentARG_0000001Iterator theDocument = (DocumentARG_0000001Iterator)findAncestorWithClass(this, DocumentARG_0000001Iterator.class);
			pageContext.getOut().print(theDocument.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

