package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebpageEditionIterator theWebpage = (WebpageEditionIterator)findAncestorWithClass(this, WebpageEditionIterator.class);
			pageContext.getOut().print(theWebpage.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for edition tag ");
		}
		return SKIP_BODY;
	}
}

