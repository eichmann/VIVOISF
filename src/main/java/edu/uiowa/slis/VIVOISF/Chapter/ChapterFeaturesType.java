package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterFeaturesIterator theChapterFeaturesIterator = (ChapterFeaturesIterator)findAncestorWithClass(this, ChapterFeaturesIterator.class);
			pageContext.getOut().print(theChapterFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for features tag ");
		}
		return SKIP_BODY;
	}
}

