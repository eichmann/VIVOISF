package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Slideshow theSlideshow = (Slideshow)findAncestorWithClass(this, Slideshow.class);
			if (!theSlideshow.commitNeeded) {
				pageContext.getOut().print(theSlideshow.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Slideshow theSlideshow = (Slideshow)findAncestorWithClass(this, Slideshow.class);
			return theSlideshow.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Slideshow for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Slideshow theSlideshow = (Slideshow)findAncestorWithClass(this, Slideshow.class);
			theSlideshow.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for subjectURI tag ");
		}
	}
}

