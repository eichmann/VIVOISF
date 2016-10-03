package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageEditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageEditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageEditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebpageEditorListIterator theWebpageEditorListIterator = (WebpageEditorListIterator)findAncestorWithClass(this, WebpageEditorListIterator.class);
			pageContext.getOut().print(theWebpageEditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for editorList tag ");
		}
		return SKIP_BODY;
	}
}

