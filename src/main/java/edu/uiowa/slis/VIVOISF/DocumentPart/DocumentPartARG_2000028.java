package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartARG_2000028Iterator theDocumentPartARG_2000028Iterator = (DocumentPartARG_2000028Iterator)findAncestorWithClass(this, DocumentPartARG_2000028Iterator.class);
			pageContext.getOut().print(theDocumentPartARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

