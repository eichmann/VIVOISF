package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaper theConferencePaper = (ConferencePaper)findAncestorWithClass(this, ConferencePaper.class);
			if (!theConferencePaper.commitNeeded) {
				pageContext.getOut().print(theConferencePaper.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ConferencePaper theConferencePaper = (ConferencePaper)findAncestorWithClass(this, ConferencePaper.class);
			return theConferencePaper.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ConferencePaper for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ConferencePaper theConferencePaper = (ConferencePaper)findAncestorWithClass(this, ConferencePaper.class);
			theConferencePaper.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for label tag ");
		}
	}
}

