package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentRank currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentRankIterator theDocument = (DocumentRankIterator)findAncestorWithClass(this, DocumentRankIterator.class);
			pageContext.getOut().print(theDocument.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for rank tag ");
		}
		return SKIP_BODY;
	}
}

