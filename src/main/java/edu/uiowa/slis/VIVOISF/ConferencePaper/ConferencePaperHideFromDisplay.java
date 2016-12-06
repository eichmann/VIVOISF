package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaper theConferencePaper = (ConferencePaper)findAncestorWithClass(this, ConferencePaper.class);
			if (!theConferencePaper.commitNeeded) {
				pageContext.getOut().print(theConferencePaper.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			ConferencePaper theConferencePaper = (ConferencePaper)findAncestorWithClass(this, ConferencePaper.class);
			return theConferencePaper.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing ConferencePaper for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			ConferencePaper theConferencePaper = (ConferencePaper)findAncestorWithClass(this, ConferencePaper.class);
			theConferencePaper.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for hideFromDisplay tag ");
		}
	}
}

