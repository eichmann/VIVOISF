package edu.uiowa.slis.VIVOISF.Presentation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PresentationLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PresentationLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PresentationLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Presentation thePresentation = (Presentation)findAncestorWithClass(this, Presentation.class);
			if (!thePresentation.commitNeeded) {
				pageContext.getOut().print(thePresentation.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Presentation for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Presentation for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Presentation thePresentation = (Presentation)findAncestorWithClass(this, Presentation.class);
			return thePresentation.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Presentation for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Presentation for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Presentation thePresentation = (Presentation)findAncestorWithClass(this, Presentation.class);
			thePresentation.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Presentation for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Presentation for label tag ");
		}
	}
}

