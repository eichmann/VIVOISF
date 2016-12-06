package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePoster theConferencePoster = (ConferencePoster)findAncestorWithClass(this, ConferencePoster.class);
			if (!theConferencePoster.commitNeeded) {
				pageContext.getOut().print(theConferencePoster.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			ConferencePoster theConferencePoster = (ConferencePoster)findAncestorWithClass(this, ConferencePoster.class);
			return theConferencePoster.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing ConferencePoster for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			ConferencePoster theConferencePoster = (ConferencePoster)findAncestorWithClass(this, ConferencePoster.class);
			theConferencePoster.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for hideFromDisplay tag ");
		}
	}
}

