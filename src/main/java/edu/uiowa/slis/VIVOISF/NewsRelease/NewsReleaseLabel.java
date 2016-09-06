package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NewsRelease theNewsRelease = (NewsRelease)findAncestorWithClass(this, NewsRelease.class);
			if (!theNewsRelease.commitNeeded) {
				pageContext.getOut().print(theNewsRelease.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			NewsRelease theNewsRelease = (NewsRelease)findAncestorWithClass(this, NewsRelease.class);
			return theNewsRelease.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing NewsRelease for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			NewsRelease theNewsRelease = (NewsRelease)findAncestorWithClass(this, NewsRelease.class);
			theNewsRelease.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for label tag ");
		}
	}
}

