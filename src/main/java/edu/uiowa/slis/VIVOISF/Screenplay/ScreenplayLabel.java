package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Screenplay theScreenplay = (Screenplay)findAncestorWithClass(this, Screenplay.class);
			if (!theScreenplay.commitNeeded) {
				pageContext.getOut().print(theScreenplay.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Screenplay theScreenplay = (Screenplay)findAncestorWithClass(this, Screenplay.class);
			return theScreenplay.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Screenplay for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Screenplay theScreenplay = (Screenplay)findAncestorWithClass(this, Screenplay.class);
			theScreenplay.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for label tag ");
		}
	}
}

