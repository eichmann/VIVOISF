package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Periodical thePeriodical = (Periodical)findAncestorWithClass(this, Periodical.class);
			if (!thePeriodical.commitNeeded) {
				pageContext.getOut().print(thePeriodical.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Periodical thePeriodical = (Periodical)findAncestorWithClass(this, Periodical.class);
			return thePeriodical.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Periodical for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Periodical thePeriodical = (Periodical)findAncestorWithClass(this, Periodical.class);
			thePeriodical.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for abbreviation tag ");
		}
	}
}

