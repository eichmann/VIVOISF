package edu.uiowa.slis.VIVOISF.URL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class URLRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static URLRank currentInstance = null;
	private static final Log log = LogFactory.getLog(URLRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			URLRankIterator theURL = (URLRankIterator)findAncestorWithClass(this, URLRankIterator.class);
			pageContext.getOut().print(theURL.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing URL for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing URL for rank tag ");
		}
		return SKIP_BODY;
	}
}

