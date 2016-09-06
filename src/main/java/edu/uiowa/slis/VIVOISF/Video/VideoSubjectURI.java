package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Video theVideo = (Video)findAncestorWithClass(this, Video.class);
			if (!theVideo.commitNeeded) {
				pageContext.getOut().print(theVideo.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Video for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Video theVideo = (Video)findAncestorWithClass(this, Video.class);
			return theVideo.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Video for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Video theVideo = (Video)findAncestorWithClass(this, Video.class);
			theVideo.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Video for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for subjectURI tag ");
		}
	}
}

