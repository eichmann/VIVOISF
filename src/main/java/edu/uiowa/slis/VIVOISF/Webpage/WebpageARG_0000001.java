package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebpageARG_0000001Iterator theWebpage = (WebpageARG_0000001Iterator)findAncestorWithClass(this, WebpageARG_0000001Iterator.class);
			pageContext.getOut().print(theWebpage.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

