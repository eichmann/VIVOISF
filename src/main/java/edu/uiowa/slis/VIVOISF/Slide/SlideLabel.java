package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Slide theSlide = (Slide)findAncestorWithClass(this, Slide.class);
			if (!theSlide.commitNeeded) {
				pageContext.getOut().print(theSlide.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Slide theSlide = (Slide)findAncestorWithClass(this, Slide.class);
			return theSlide.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Slide for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Slide theSlide = (Slide)findAncestorWithClass(this, Slide.class);
			theSlide.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for label tag ");
		}
	}
}

