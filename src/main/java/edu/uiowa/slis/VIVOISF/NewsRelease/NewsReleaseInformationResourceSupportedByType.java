package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseInformationResourceSupportedByIterator theNewsReleaseInformationResourceSupportedByIterator = (NewsReleaseInformationResourceSupportedByIterator)findAncestorWithClass(this, NewsReleaseInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theNewsReleaseInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

