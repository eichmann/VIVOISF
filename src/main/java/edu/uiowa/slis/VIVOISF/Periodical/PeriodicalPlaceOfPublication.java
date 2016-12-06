package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Periodical thePeriodical = (Periodical)findAncestorWithClass(this, Periodical.class);
			if (!thePeriodical.commitNeeded) {
				pageContext.getOut().print(thePeriodical.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			Periodical thePeriodical = (Periodical)findAncestorWithClass(this, Periodical.class);
			return thePeriodical.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing Periodical for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			Periodical thePeriodical = (Periodical)findAncestorWithClass(this, Periodical.class);
			thePeriodical.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for placeOfPublication tag ");
		}
	}
}

