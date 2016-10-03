package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebsiteEditorIterator theWebsiteEditorIterator = (WebsiteEditorIterator)findAncestorWithClass(this, WebsiteEditorIterator.class);
			pageContext.getOut().print(theWebsiteEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for editor tag ");
		}
		return SKIP_BODY;
	}
}

