package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterHasTelephoneIterator theChapterHasTelephoneIterator = (ChapterHasTelephoneIterator)findAncestorWithClass(this, ChapterHasTelephoneIterator.class);
			pageContext.getOut().print(theChapterHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

