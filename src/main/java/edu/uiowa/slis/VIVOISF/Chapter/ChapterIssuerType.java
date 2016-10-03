package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterIssuerIterator theChapterIssuerIterator = (ChapterIssuerIterator)findAncestorWithClass(this, ChapterIssuerIterator.class);
			pageContext.getOut().print(theChapterIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for issuer tag ");
		}
		return SKIP_BODY;
	}
}

