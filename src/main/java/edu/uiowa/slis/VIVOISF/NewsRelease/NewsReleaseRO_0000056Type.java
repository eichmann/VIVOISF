package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseRO_0000056Iterator theNewsReleaseRO_0000056Iterator = (NewsReleaseRO_0000056Iterator)findAncestorWithClass(this, NewsReleaseRO_0000056Iterator.class);
			pageContext.getOut().print(theNewsReleaseRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

