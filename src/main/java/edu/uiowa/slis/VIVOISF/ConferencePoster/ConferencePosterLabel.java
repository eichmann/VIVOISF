package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePoster theConferencePoster = (ConferencePoster)findAncestorWithClass(this, ConferencePoster.class);
			if (!theConferencePoster.commitNeeded) {
				pageContext.getOut().print(theConferencePoster.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ConferencePoster theConferencePoster = (ConferencePoster)findAncestorWithClass(this, ConferencePoster.class);
			return theConferencePoster.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ConferencePoster for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ConferencePoster theConferencePoster = (ConferencePoster)findAncestorWithClass(this, ConferencePoster.class);
			theConferencePoster.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for label tag ");
		}
	}
}

