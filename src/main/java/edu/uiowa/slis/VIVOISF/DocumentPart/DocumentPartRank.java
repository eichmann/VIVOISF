package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartRank currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartRankIterator theDocumentPart = (DocumentPartRankIterator)findAncestorWithClass(this, DocumentPartRankIterator.class);
			pageContext.getOut().print(theDocumentPart.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for rank tag ");
		}
		return SKIP_BODY;
	}
}

