package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Slide theSlide = (Slide)findAncestorWithClass(this, Slide.class);
			if (!theSlide.commitNeeded) {
				pageContext.getOut().print(theSlide.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Slide theSlide = (Slide)findAncestorWithClass(this, Slide.class);
			return theSlide.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Slide for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Slide theSlide = (Slide)findAncestorWithClass(this, Slide.class);
			theSlide.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for subjectURI tag ");
		}
	}
}

