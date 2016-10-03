package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebpageEditorListIterator theWebpageEditorListIterator = (WebpageEditorListIterator)findAncestorWithClass(this, WebpageEditorListIterator.class);
			pageContext.getOut().print(theWebpageEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for editorList tag ");
		}
		return SKIP_BODY;
	}
}

