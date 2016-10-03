package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseOclcnumIterator theNewsRelease = (NewsReleaseOclcnumIterator)findAncestorWithClass(this, NewsReleaseOclcnumIterator.class);
			pageContext.getOut().print(theNewsRelease.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

