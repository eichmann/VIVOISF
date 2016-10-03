package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseEditorListIterator theNewsReleaseEditorListIterator = (NewsReleaseEditorListIterator)findAncestorWithClass(this, NewsReleaseEditorListIterator.class);
			pageContext.getOut().print(theNewsReleaseEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for editorList tag ");
		}
		return SKIP_BODY;
	}
}

