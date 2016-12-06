package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalNationalityZHIterator thePeriodical = (PeriodicalNationalityZHIterator)findAncestorWithClass(this, PeriodicalNationalityZHIterator.class);
			pageContext.getOut().print(thePeriodical.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

