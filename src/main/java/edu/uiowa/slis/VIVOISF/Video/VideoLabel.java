package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Video theVideo = (Video)findAncestorWithClass(this, Video.class);
			if (!theVideo.commitNeeded) {
				pageContext.getOut().print(theVideo.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Video for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Video theVideo = (Video)findAncestorWithClass(this, Video.class);
			return theVideo.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Video for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Video theVideo = (Video)findAncestorWithClass(this, Video.class);
			theVideo.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Video for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for label tag ");
		}
	}
}

