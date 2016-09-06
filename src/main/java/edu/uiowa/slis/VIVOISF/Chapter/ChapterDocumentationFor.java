package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterDocumentationFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterDocumentationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterDocumentationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterDocumentationForIterator theChapterDocumentationForIterator = (ChapterDocumentationForIterator)findAncestorWithClass(this, ChapterDocumentationForIterator.class);
			pageContext.getOut().print(theChapterDocumentationForIterator.getDocumentationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

