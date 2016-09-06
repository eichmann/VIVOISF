package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NewsRelease theNewsRelease = (NewsRelease)findAncestorWithClass(this, NewsRelease.class);
			if (!theNewsRelease.commitNeeded) {
				pageContext.getOut().print(theNewsRelease.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			NewsRelease theNewsRelease = (NewsRelease)findAncestorWithClass(this, NewsRelease.class);
			return theNewsRelease.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing NewsRelease for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			NewsRelease theNewsRelease = (NewsRelease)findAncestorWithClass(this, NewsRelease.class);
			theNewsRelease.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for subjectURI tag ");
		}
	}
}

