package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterIssuerIterator theChapterIssuerIterator = (ChapterIssuerIterator)findAncestorWithClass(this, ChapterIssuerIterator.class);
			pageContext.getOut().print(theChapterIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for issuer tag ");
		}
		return SKIP_BODY;
	}
}

