package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebsiteARG_2000028Iterator theWebsiteARG_2000028Iterator = (WebsiteARG_2000028Iterator)findAncestorWithClass(this, WebsiteARG_2000028Iterator.class);
			pageContext.getOut().print(theWebsiteARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

