package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseEditorIterator theNewsReleaseEditorIterator = (NewsReleaseEditorIterator)findAncestorWithClass(this, NewsReleaseEditorIterator.class);
			pageContext.getOut().print(theNewsReleaseEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for editor tag ");
		}
		return SKIP_BODY;
	}
}

