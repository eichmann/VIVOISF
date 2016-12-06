package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Periodical thePeriodical = (Periodical)findAncestorWithClass(this, Periodical.class);
			if (!thePeriodical.commitNeeded) {
				pageContext.getOut().print(thePeriodical.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			Periodical thePeriodical = (Periodical)findAncestorWithClass(this, Periodical.class);
			return thePeriodical.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing Periodical for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			Periodical thePeriodical = (Periodical)findAncestorWithClass(this, Periodical.class);
			thePeriodical.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hideFromDisplay tag ");
		}
	}
}

