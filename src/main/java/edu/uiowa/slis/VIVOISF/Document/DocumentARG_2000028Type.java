package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentARG_2000028Iterator theDocumentARG_2000028Iterator = (DocumentARG_2000028Iterator)findAncestorWithClass(this, DocumentARG_2000028Iterator.class);
			pageContext.getOut().print(theDocumentARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

