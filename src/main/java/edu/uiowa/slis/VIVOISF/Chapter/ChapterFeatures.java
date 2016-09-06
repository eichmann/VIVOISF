package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterFeaturesIterator theChapterFeaturesIterator = (ChapterFeaturesIterator)findAncestorWithClass(this, ChapterFeaturesIterator.class);
			pageContext.getOut().print(theChapterFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for features tag ");
		}
		return SKIP_BODY;
	}
}

