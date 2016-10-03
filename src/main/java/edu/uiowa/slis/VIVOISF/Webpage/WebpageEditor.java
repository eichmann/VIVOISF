package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebpageEditorIterator theWebpageEditorIterator = (WebpageEditorIterator)findAncestorWithClass(this, WebpageEditorIterator.class);
			pageContext.getOut().print(theWebpageEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for editor tag ");
		}
		return SKIP_BODY;
	}
}

